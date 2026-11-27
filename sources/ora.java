// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ora implements kcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ ora(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // kcc
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                this.b.v2((View) obj2, (CharSequence) obj, booleanValue);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                icc iccVar = (icc) obj2;
                Runnable runnable = (Runnable) obj3;
                wua wuaVar = this.b;
                ld9 ld9Var = wuaVar.R2;
                if (ld9Var != null) {
                    ld9Var.b();
                    wuaVar.R2 = null;
                }
                TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj4).slug;
                    craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
                }
                ConnectionsManager.getInstance(wuaVar.a).sendRequestTyped(craftstargift, new ic((byte) 0), new nu0((Object) wuaVar, (Object) iccVar, (Object) arrayList, (Object) runnable, (byte) 14));
                break;
        }
    }
}
