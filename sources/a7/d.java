package a7;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.b0;
import androidx.mediarouter.app.z;
import org.telegram.messenger.k5;
import org.telegram.messenger.ns;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.voip.u;
import org.telegram.ui.vt;
import org.telegram.ui.yw;
import s4.v;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e10) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
                    return;
                }
            case 1:
                z zVar = (z) this.c;
                b0 b0Var = zVar.z.r;
                v vVar = (v) this.b;
                b0Var.E = vVar;
                vVar.l();
                zVar.w.setVisibility(4);
                zVar.x.setVisibility(0);
                break;
            default:
                if (!yw.z4) {
                    yw.z4 = true;
                    SharedPreferences sharedPreferences = t0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (j6.Q0(string) == null || j6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (j6.Q0(string2) == null || !j6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    i6 i6Var = j6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean q10 = j6.I.q();
                        boolean z10 = !q10;
                        i6 Q0 = q10 ? j6.Q0(str2) : j6.Q0(str);
                        ch0 ch0Var = ((vt) this.c).d;
                        ch0Var.P(q10 ? ch0Var.e[0] - 1 : 0);
                        ((vt) this.c).e.getImageView().d();
                        int[] iArr = {(((vt) this.c).e.getImageView().getMeasuredWidth() / 2) + r6, k5.C(3.0f, ((vt) this.c).e.getImageView().getMeasuredHeight() / 2, r6)};
                        ((vt) this.c).e.getImageView().getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int i10 = iArr[1];
                        ns.e().k(ns.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), ((vt) this.c).e.getImageView(), ((vt) this.c).e, new u(7, this, (e2) this.b));
                        break;
                    }
                    str = string;
                    boolean q102 = j6.I.q();
                    boolean z102 = !q102;
                    if (q102) {
                    }
                    ch0 ch0Var2 = ((vt) this.c).d;
                    ch0Var2.P(q102 ? ch0Var2.e[0] - 1 : 0);
                    ((vt) this.c).e.getImageView().d();
                    int[] iArr2 = {(((vt) this.c).e.getImageView().getMeasuredWidth() / 2) + i7, k5.C(3.0f, ((vt) this.c).e.getImageView().getMeasuredHeight() / 2, i10)};
                    ((vt) this.c).e.getImageView().getLocationInWindow(iArr2);
                    int i72 = iArr2[0];
                    int i102 = iArr2[1];
                    ns.e().k(ns.t4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z102), ((vt) this.c).e.getImageView(), ((vt) this.c).e, new u(7, this, (e2) this.b));
                }
                break;
        }
    }

    public d(Context context, Intent intent) {
        this.a = 0;
        this.b = context;
        this.c = intent;
    }
}
