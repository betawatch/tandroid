// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a32 extends FrameLayout {
    public final de0 a;
    public final ff0 b;
    public final ema c;
    public final og2 d;
    public final rb0 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public boolean x;

    public a32(Context context, vnb vnbVar) {
        super(context);
        this.e = new rb0(vnbVar);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(23.0f));
        boolean z = ob6.a0;
        addView(de0Var, tre.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 14.0f, 9.0f, z ? 14.0f : 0.0f, 0.0f));
        ff0 ff0Var = new ff0(context, (byte) 1);
        this.b = ff0Var;
        jn7.i(ff0Var);
        yob.W(ff0Var, aob.j5, vnbVar);
        ff0Var.setTypeface(hl.o());
        ff0Var.setTextSize(16);
        ff0Var.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z2 = ob6.a0;
        addView(ff0Var, tre.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 12.0f, z2 ? 72.0f : 28.0f, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        emaVar.setTextSize(13);
        yob.W(emaVar, aob.q5, vnbVar);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z3 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 36.0f, z3 ? 72.0f : 28.0f, 0.0f));
        og2 og2Var = new og2(21, vnbVar, context);
        this.d = og2Var;
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        boolean z4 = ob6.a0;
        addView(og2Var, tre.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 44.0f, 37.0f, z4 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, z22 z22Var, boolean z) {
        de0 de0Var = this.a;
        ff0 ff0Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            ff0Var.l("", false);
            this.c.l("", false);
            de0Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.x = z;
            setWillNotDraw(!z);
            rb0 rb0Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                rb0Var.q(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                long j = this.h;
                if (charSequence2 != null) {
                    rb0Var.j(j, charSequence2.toString(), null, null);
                } else {
                    rb0Var.j(j, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                ff0Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                ff0Var.l(user3 != null ? lbc.r(user3) : "", false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                de0Var.f(user4, rb0Var);
            } else {
                de0Var.setImageDrawable(rb0Var);
            }
        }
        Utilities.e.c(new dy1(this, z22Var, (byte) 12));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(70.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
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
                this.c.l(ob6.M0(2131747559, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new y22(this, (byte) 0));
            }
        }
    }
}
