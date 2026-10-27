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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(fj.N((fj) this.b, (MessageObject) obj));
            case 1:
                th.f fVar = (th.f) this.b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, org.telegram.ui.ActionBar.y6.Pb, (org.telegram.ui.ActionBar.y6.I.q() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.y6.qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new qq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.u8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new dd(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) this.b).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                s71 s71Var = (s71) this.b;
                View view2 = (View) obj;
                s71Var.getClass();
                return view2.getParent() != s71Var ? Boolean.FALSE : Boolean.valueOf(!k71.K(s71Var.T(view2).f));
        }
    }
}
