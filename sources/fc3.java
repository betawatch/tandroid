// default package

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fc3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public fc3(itb itbVar) {
        this.a = (byte) 2;
        this.c = itbVar;
        Context context = itbVar.a.getContext();
        CharSequence charSequence = itbVar.h;
        v8 v8Var = new v8();
        v8Var.e = TLObject.FLAG_12;
        v8Var.g = TLObject.FLAG_12;
        v8Var.l = null;
        v8Var.m = null;
        v8Var.n = false;
        v8Var.o = false;
        v8Var.p = 16;
        v8Var.i = context;
        v8Var.a = charSequence;
        this.b = v8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                if (!cj3.C4) {
                    cj3.C4 = true;
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (bkb.O0(string) == null || bkb.O0(string).o()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
                        string2 = "Dark Blue";
                    }
                    akb akbVar = bkb.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean o = bkb.I.o();
                        boolean z = !o;
                        akb O0 = o ? bkb.O0(str2) : bkb.O0(str);
                        oy8 oy8Var = ((hc3) this.c).d;
                        oy8Var.K(o ? oy8Var.e[0] - 1 : 0);
                        ((hc3) this.c).e.getImageView().d();
                        int[] iArr = {(((hc3) this.c).e.getImageView().getMeasuredWidth() / 2) + r6, de9.w(3.0f, ((hc3) this.c).e.getImageView().getMeasuredHeight() / 2, r6)};
                        ((hc3) this.c).e.getImageView().getLocationInWindow(iArr);
                        int i = iArr[0];
                        int i2 = iArr[1];
                        kk7.e().k(kk7.v4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), ((hc3) this.c).e.getImageView(), ((hc3) this.c).e, new gu2((Object) this, this.b, (byte) 29));
                        break;
                    }
                    str = string;
                    boolean o2 = bkb.I.o();
                    boolean z2 = !o2;
                    if (o2) {
                    }
                    oy8 oy8Var2 = ((hc3) this.c).d;
                    oy8Var2.K(o2 ? oy8Var2.e[0] - 1 : 0);
                    ((hc3) this.c).e.getImageView().d();
                    int[] iArr2 = {(((hc3) this.c).e.getImageView().getMeasuredWidth() / 2) + i, de9.w(3.0f, ((hc3) this.c).e.getImageView().getMeasuredHeight() / 2, i2)};
                    ((hc3) this.c).e.getImageView().getLocationInWindow(iArr2);
                    int i3 = iArr2[0];
                    int i22 = iArr2[1];
                    kk7.e().k(kk7.v4, O0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z2), ((hc3) this.c).e.getImageView(), ((hc3) this.c).e, new gu2((Object) this, this.b, (byte) 29));
                }
                break;
            case 1:
                et6 et6Var = (et6) this.c;
                gt6 gt6Var = et6Var.z.r;
                eu6 eu6Var = (eu6) this.b;
                gt6Var.E = eu6Var;
                eu6Var.l();
                et6Var.w.setVisibility(4);
                et6Var.x.setVisibility(0);
                break;
            case 2:
                itb itbVar = (itb) this.c;
                Window.Callback callback = itbVar.k;
                if (callback != null && itbVar.l) {
                    callback.onMenuItemSelected(0, (v8) this.b);
                    break;
                }
                break;
            default:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
        }
    }

    public /* synthetic */ fc3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public fc3(Context context, Intent intent) {
        this.a = (byte) 3;
        this.b = context;
        this.c = intent;
    }
}
