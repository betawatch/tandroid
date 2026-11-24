// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j22 extends FrameLayout {
    public final be0 a;
    public final df0 b;
    public final jia c;
    public final wf2 d;
    public final pb0 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public boolean x;

    public j22(Context context, wjb wjbVar) {
        super(context);
        this.e = new pb0(wjbVar);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(23.0f));
        boolean z = k96.a0;
        addView(be0Var, nme.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 14.0f, 9.0f, z ? 14.0f : 0.0f, 0.0f));
        df0 df0Var = new df0(context, (byte) 1);
        this.b = df0Var;
        kk7.i(df0Var);
        zkb.W(df0Var, bkb.i5, wjbVar);
        df0Var.setTypeface(gl.o());
        df0Var.setTextSize(16);
        df0Var.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z2 = k96.a0;
        addView(df0Var, nme.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 12.0f, z2 ? 72.0f : 28.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        jiaVar.setTextSize(13);
        zkb.W(jiaVar, bkb.p5, wjbVar);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z3 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 36.0f, z3 ? 72.0f : 28.0f, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.d = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        boolean z4 = k96.a0;
        addView(wf2Var, nme.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 44.0f, 37.0f, z4 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, i22 i22Var, boolean z) {
        be0 be0Var = this.a;
        df0 df0Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            df0Var.l("", false);
            this.c.l("", false);
            be0Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.x = z;
            setWillNotDraw(!z);
            pb0 pb0Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                pb0Var.q(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                long j = this.h;
                if (charSequence2 != null) {
                    pb0Var.j(j, charSequence2.toString(), null, null);
                } else {
                    pb0Var.j(j, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                df0Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                df0Var.l(user3 != null ? l7c.r(user3) : "", false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                be0Var.f(user4, pb0Var);
            } else {
                be0Var.setImageDrawable(pb0Var);
            }
        }
        Utilities.e.c(new kx1(this, i22Var, (byte) 12));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(70.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCurrentId(int i) {
        this.h = i;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.r = charSequence;
        if (charSequence != null) {
            this.c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.c.l(k96.M0(2131747639, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new h22(this, (byte) 0));
            }
        }
    }
}
