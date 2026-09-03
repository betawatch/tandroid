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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(xi.J((xi) this.b, (MessageObject) obj));
            case 1:
                fh.g gVar = (fh.g) this.b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, org.telegram.ui.ActionBar.k6.Pb, (org.telegram.ui.ActionBar.k6.I.q() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.k6.qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(gVar.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new eq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new fh.f(imageReceiver, 0));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new ef.f(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) this.b).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                h61 h61Var = (h61) this.b;
                View view2 = (View) obj;
                h61Var.getClass();
                return view2.getParent() != h61Var ? Boolean.FALSE : Boolean.valueOf(!w51.K(h61Var.T(view2).f));
        }
    }
}
