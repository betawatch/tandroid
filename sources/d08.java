// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d08 extends View implements tjb {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final wjb d;
    public final Drawable e;
    public final tgb f;
    public final gc h;
    public final Paint n;
    public tgb r;
    public int s;
    public boolean w;
    public u08 x;
    public u08 y;

    public d08(int i, long j, wjb wjbVar, Context context) {
        super(context);
        int i2;
        this.n = new Paint(1);
        this.s = -1;
        na7 q1 = na7.q1(i);
        gr grVar = q1.k4;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(-j));
        this.a = i;
        boolean z = j < 0;
        this.b = z;
        boolean z2 = z && !hc2.V(K0);
        this.c = z2;
        this.d = wjbVar;
        Drawable d = b00.d(context, R.drawable.menu_edit_appearance);
        this.e = d;
        zkb.x(this, d, bkb.p6, wjbVar, PorterDuff.Mode.SRC_IN);
        String M0 = k96.M0(z ? z2 ? 2131752534 : 2131752539 : 2131752518, null);
        if (z && !z2 && na7.q1(i).X3.getInt("boostingappearance", 0) < 3) {
            ea7 ea7Var = q1.E3;
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (ea7Var != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, ea7Var.e(false));
                int max = Math.max(0, q1.E3.e(false));
                int min2 = Math.min(min, q1.E3.f());
                int max2 = Math.max(max, q1.E3.f());
                i3 = min2;
                i2 = max2;
            } else {
                i2 = 0;
            }
            kr2 kr2Var = grVar.V1;
            kr2 kr2Var2 = grVar.g2;
            kr2 kr2Var3 = grVar.f2;
            kr2 kr2Var4 = grVar.X1;
            kr2 kr2Var5 = grVar.W1;
            int min3 = Math.min(i3, kr2Var.f());
            int min4 = Math.min(i2, grVar.V1.f());
            ea7 ea7Var2 = q1.F3;
            if (ea7Var2 != null) {
                int min5 = Math.min(min3, ea7Var2.e(false));
                int max3 = Math.max(min4, q1.F3.e(false));
                min3 = Math.min(min5, q1.F3.f());
                min4 = Math.max(max3, q1.F3.f());
            }
            int min6 = Math.min(min3, kr2Var5.f());
            int max4 = Math.max(min4, kr2Var5.f());
            int min7 = Math.min(min6, kr2Var4.f());
            int max5 = Math.max(max4, kr2Var4.f());
            int min8 = Math.min(min7, kr2Var3.f());
            int max6 = Math.max(max5, kr2Var3.f());
            int min9 = Math.min(min8, kr2Var2.f());
            int max7 = Math.max(max6, kr2Var2.f());
            int i4 = K0 != null ? K0.level : 0;
            if (i4 < max7) {
                this.h = new gc(Math.max(i4, min9), wjbVar, context, true);
            }
        }
        setContentDescription(M0);
        this.f = new tgb(M0, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = gl.L(64.0f) / 2;
        if (k96.a0) {
            L = getMeasuredWidth() - L;
        }
        Drawable drawable = this.e;
        kq3.d(drawable, L, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - gl.L(171.0f);
        gc gcVar = this.h;
        int L2 = gcVar != null ? gl.L(8.0f) + gcVar.getIntrinsicWidth() : 0;
        tgb tgbVar = this.f;
        tgbVar.p = measuredWidth - L2;
        float measuredWidth2 = k96.a0 ? (getMeasuredWidth() - tgbVar.j()) - gl.L(71.0f) : gl.L(71.0f);
        tgbVar.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (gcVar != null) {
            int j = (int) (tgbVar.j() + measuredWidth2 + gl.L(6.0f));
            gcVar.setBounds(j, 0, j, getHeight());
            gcVar.draw(canvas);
        }
        wjb wjbVar = this.d;
        boolean z = this.c;
        if (z && this.y != null) {
            int L3 = k96.a0 ? gl.L(58.0f) : getMeasuredWidth() - gl.L(24.0f);
            this.y.setBounds(L3 - gl.L(11.0f), ug8.D(11.0f, getMeasuredHeight(), 2), L3, (gl.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(gl.N(3.0f), bkb.v0(bkb.c6, wjbVar));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            int L4 = k96.a0 ? gl.L(58.0f) : getMeasuredWidth() - gl.L(24.0f);
            this.y.setBounds(L4 - gl.L(11.0f), ug8.D(11.0f, getMeasuredHeight(), 2), L4, (gl.L(11.0f) + getMeasuredHeight()) / 2);
            u08 u08Var = this.y;
            float N = gl.N(3.0f);
            int i = bkb.c6;
            u08Var.f(N, bkb.v0(i, wjbVar));
            this.y.draw(canvas);
            int L5 = L4 - gl.L(18.0f);
            this.x.setBounds(L5 - gl.L(11.0f), ug8.D(11.0f, getMeasuredHeight(), 2), L5, (gl.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(gl.N(3.0f), bkb.v0(i, wjbVar));
            this.x.draw(canvas);
        } else if (this.r != null && !z) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - gl.L(116.0f)) - Math.min(tgbVar.j() + (gcVar == null ? 0 : gl.L(12.0f) + gcVar.getIntrinsicWidth()), getMeasuredWidth() - gl.L(164.0f)));
            int min = (int) Math.min(this.r.j(), measuredWidth3);
            RectF rectF = gl.P;
            rectF.set(k96.a0 ? gl.L(15.0f) : ls6.x(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - gl.L(22.0f)) / 2.0f, k96.a0 ? gl.L(33.0f) + min : getMeasuredWidth() - gl.L(15.0f), (gl.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), this.n);
            tgb tgbVar2 = this.r;
            tgbVar2.p = measuredWidth3;
            tgbVar2.e(canvas, k96.a0 ? gl.L(24.0f) : ls6.x(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            Paint d = wjbVar != null ? wjbVar.d("paintDivider") : null;
            if (d == null) {
                d = bkb.j0;
            }
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(71.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(50.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        u08 u08Var;
        int v0;
        ArrayList<Integer> arrayList;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        String trim = str == null ? "" : str.trim();
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        this.r = new tgb(vu3.m(trim, bkb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gl.o());
        u08 u08Var2 = this.x;
        if (u08Var2 != null) {
            u08Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i = this.a;
        if (z) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i2 = u08.j;
            int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
            u08Var = new u08(i3, i3, i3, tL_emojiStatusCollectible.document_id);
            this.x = u08Var;
        } else {
            if (l7c.n(user) >= 0) {
                u08 c = u08.c(i, l7c.n(user));
                c.a = gl.L(11.0f);
                c.d();
                u08Var = c;
            } else {
                u08Var = null;
            }
            this.x = u08Var;
        }
        if (u08Var != null) {
            u08Var.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        wjb wjbVar = this.d;
        if (z2) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a = wjbVar != null ? wjbVar.a() : bkb.I.o();
            int i4 = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.m(i4);
            paint.setColor(bkb.p1(0.1f, i4));
            u08 u08Var3 = new u08(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
            u08Var3.a = gl.L(11.0f);
            u08Var3.d();
            this.y = u08Var3;
            u08Var3.e(this);
            return;
        }
        int f = l7c.f(user);
        if (f < 7) {
            int i5 = bkb.q8[f];
            this.s = i5;
            v0 = bkb.v0(i5, wjbVar);
        } else {
            ea7 ea7Var = na7.q1(y6c.t0).E3;
            da7 d = ea7Var != null ? ea7Var.d(f) : null;
            if (d != null) {
                this.s = -1;
                v0 = d.f();
            } else {
                int i6 = bkb.q8[0];
                this.s = i6;
                v0 = bkb.v0(i6, wjbVar);
            }
        }
        this.r.m(v0);
        paint.setColor(bkb.p1(0.1f, v0));
        u08 a2 = u08.a(i, f);
        a2.a = gl.L(11.0f);
        a2.d();
        this.y = a2;
    }

    @Override // tjb
    public final void updateColors() {
        Paint paint;
        int i;
        boolean z = this.b;
        int i2 = z ? bkb.l6 : bkb.p6;
        wjb wjbVar = this.d;
        int v0 = bkb.v0(i2, wjbVar);
        if (!this.E || this.F != v0) {
            this.E = true;
            this.F = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        this.f.m(bkb.v0(z ? bkb.F6 : bkb.p6, wjbVar));
        if (this.r == null || (paint = this.n) == null || (i = this.s) == -1) {
            return;
        }
        int v02 = bkb.v0(i, wjbVar);
        this.r.m(v02);
        paint.setColor(bkb.p1(0.1f, v02));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
