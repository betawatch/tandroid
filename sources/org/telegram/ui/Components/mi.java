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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mi(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(vi.J((vi) this.b, (MessageObject) obj));
            case 1:
                zg.f fVar = (zg.f) this.b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, org.telegram.ui.ActionBar.f6.Pb, (org.telegram.ui.ActionBar.f6.I.q() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.f6.qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new up(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.o8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new vc(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i9 = ((SparseIntArray) this.b).get(((Integer) obj).intValue(), -1);
                if (i9 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i9 == 1);
            default:
                i51 i51Var = (i51) this.b;
                View view2 = (View) obj;
                i51Var.getClass();
                return view2.getParent() != i51Var ? Boolean.FALSE : Boolean.valueOf(!z41.K(i51Var.T(view2).f));
        }
    }
}
