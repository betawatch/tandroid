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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(gj.K((gj) this.b, (MessageObject) obj));
            case 1:
                rh.f fVar = (rh.f) this.b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, org.telegram.ui.ActionBar.i6.Pb, (org.telegram.ui.ActionBar.i6.I.q() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.i6.qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new eq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.q8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new cd(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) this.b).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                e61 e61Var = (e61) this.b;
                View view2 = (View) obj;
                e61Var.getClass();
                return view2.getParent() != e61Var ? Boolean.FALSE : Boolean.valueOf(!w51.K(e61Var.T(view2).f));
        }
    }
}
