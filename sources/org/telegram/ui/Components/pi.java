package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(yi.J((yi) this.b, (MessageObject) obj));
            case 1:
                ch.g gVar = (ch.g) this.b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, org.telegram.ui.ActionBar.g6.Pb, (org.telegram.ui.ActionBar.g6.I.q() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.g6.qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(gVar.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new yp(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new ch.f(imageReceiver, 0));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new cf.f(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) this.b).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                u51 u51Var = (u51) this.b;
                View view2 = (View) obj;
                u51Var.getClass();
                return view2.getParent() != u51Var ? Boolean.FALSE : Boolean.valueOf(!k51.K(u51Var.T(view2).f));
        }
    }
}
