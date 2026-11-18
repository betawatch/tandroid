package a7;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.b0;
import androidx.mediarouter.app.z;
import org.telegram.messenger.f3;
import org.telegram.messenger.ks;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.cx;
import org.telegram.ui.vs;
import org.telegram.ui.xt;
import s4.v;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                if (!cx.C4) {
                    cx.C4 = true;
                    SharedPreferences sharedPreferences = t0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (n6.Q0(string) == null || n6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (n6.Q0(string2) == null || !n6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    m6 m6Var = n6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (m6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean q10 = n6.I.q();
                        boolean z10 = !q10;
                        m6 Q0 = q10 ? n6.Q0(str2) : n6.Q0(str);
                        mh0 mh0Var = ((xt) this.c).d;
                        mh0Var.P(q10 ? mh0Var.e[0] - 1 : 0);
                        ((xt) this.c).e.getImageView().d();
                        int[] iArr = {(((xt) this.c).e.getImageView().getMeasuredWidth() / 2) + r6, f3.C(3.0f, ((xt) this.c).e.getImageView().getMeasuredHeight() / 2, r6)};
                        ((xt) this.c).e.getImageView().getLocationInWindow(iArr);
                        int i7 = iArr[0];
                        int i10 = iArr[1];
                        ks.e().k(ks.w4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z10), ((xt) this.c).e.getImageView(), ((xt) this.c).e, new vs(2, this, (h2) this.b));
                        break;
                    }
                    str = string;
                    boolean q102 = n6.I.q();
                    boolean z102 = !q102;
                    if (q102) {
                    }
                    mh0 mh0Var2 = ((xt) this.c).d;
                    mh0Var2.P(q102 ? mh0Var2.e[0] - 1 : 0);
                    ((xt) this.c).e.getImageView().d();
                    int[] iArr2 = {(((xt) this.c).e.getImageView().getMeasuredWidth() / 2) + i7, f3.C(3.0f, ((xt) this.c).e.getImageView().getMeasuredHeight() / 2, i10)};
                    ((xt) this.c).e.getImageView().getLocationInWindow(iArr2);
                    int i72 = iArr2[0];
                    int i102 = iArr2[1];
                    ks.e().k(ks.w4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z102), ((xt) this.c).e.getImageView(), ((xt) this.c).e, new vs(2, this, (h2) this.b));
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
