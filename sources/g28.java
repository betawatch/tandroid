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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g28 extends View implements vlb {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final ylb d;
    public final Drawable e;
    public final uib f;
    public final hd h;
    public final Paint n;
    public uib r;
    public int s;
    public boolean w;
    public x28 x;
    public x28 y;

    public g28(int i, long j, ylb ylbVar, Context context) {
        super(context);
        int i2;
        this.n = new Paint(1);
        this.s = -1;
        oc7 r1 = oc7.r1(i);
        gs gsVar = r1.l4;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(-j));
        this.a = i;
        boolean z = j < 0;
        this.b = z;
        boolean z2 = z && !sd2.V(L0);
        this.c = z2;
        this.d = ylbVar;
        Drawable d = b10.d(context, R.drawable.menu_edit_appearance);
        this.e = d;
        anb.x(this, d, cmb.p6, ylbVar, PorterDuff.Mode.SRC_IN);
        String M0 = jb6.M0(z ? z2 ? 2131752499 : 2131752504 : 2131752483, null);
        if (z && !z2 && oc7.r1(i).X3.getInt("boostingappearance", 0) < 3) {
            fc7 fc7Var = r1.E3;
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (fc7Var != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, fc7Var.e(false));
                int max = Math.max(0, r1.E3.e(false));
                int min2 = Math.min(min, r1.E3.f());
                int max2 = Math.max(max, r1.E3.f());
                i3 = min2;
                i2 = max2;
            } else {
                i2 = 0;
            }
            vs2 vs2Var = gsVar.V1;
            vs2 vs2Var2 = gsVar.g2;
            vs2 vs2Var3 = gsVar.f2;
            vs2 vs2Var4 = gsVar.X1;
            vs2 vs2Var5 = gsVar.W1;
            int min3 = Math.min(i3, vs2Var.f());
            int min4 = Math.min(i2, gsVar.V1.f());
            fc7 fc7Var2 = r1.F3;
            if (fc7Var2 != null) {
                int min5 = Math.min(min3, fc7Var2.e(false));
                int max3 = Math.max(min4, r1.F3.e(false));
                min3 = Math.min(min5, r1.F3.f());
                min4 = Math.max(max3, r1.F3.f());
            }
            int min6 = Math.min(min3, vs2Var5.f());
            int max4 = Math.max(min4, vs2Var5.f());
            int min7 = Math.min(min6, vs2Var4.f());
            int max5 = Math.max(max4, vs2Var4.f());
            int min8 = Math.min(min7, vs2Var3.f());
            int max6 = Math.max(max5, vs2Var3.f());
            int min9 = Math.min(min8, vs2Var2.f());
            int max7 = Math.max(max6, vs2Var2.f());
            int i4 = L0 != null ? L0.level : 0;
            if (i4 < max7) {
                this.h = new hd(Math.max(i4, min9), ylbVar, context, true);
            }
        }
        setContentDescription(M0);
        this.f = new uib(M0, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = gm.L(64.0f) / 2;
        if (jb6.a0) {
            L = getMeasuredWidth() - L;
        }
        Drawable drawable = this.e;
        ur3.d(drawable, L, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - gm.L(171.0f);
        hd hdVar = this.h;
        int L2 = hdVar != null ? gm.L(8.0f) + hdVar.getIntrinsicWidth() : 0;
        uib uibVar = this.f;
        uibVar.p = measuredWidth - L2;
        float measuredWidth2 = jb6.a0 ? (getMeasuredWidth() - uibVar.j()) - gm.L(71.0f) : gm.L(71.0f);
        uibVar.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (hdVar != null) {
            int j = (int) (uibVar.j() + measuredWidth2 + gm.L(6.0f));
            hdVar.setBounds(j, 0, j, getHeight());
            hdVar.draw(canvas);
        }
        ylb ylbVar = this.d;
        boolean z = this.c;
        if (z && this.y != null) {
            int L3 = jb6.a0 ? gm.L(58.0f) : getMeasuredWidth() - gm.L(24.0f);
            this.y.setBounds(L3 - gm.L(11.0f), wi8.D(11.0f, getMeasuredHeight(), 2), L3, (gm.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(gm.N(3.0f), cmb.v0(cmb.c6, ylbVar));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            int L4 = jb6.a0 ? gm.L(58.0f) : getMeasuredWidth() - gm.L(24.0f);
            this.y.setBounds(L4 - gm.L(11.0f), wi8.D(11.0f, getMeasuredHeight(), 2), L4, (gm.L(11.0f) + getMeasuredHeight()) / 2);
            x28 x28Var = this.y;
            float N = gm.N(3.0f);
            int i = cmb.c6;
            x28Var.f(N, cmb.v0(i, ylbVar));
            this.y.draw(canvas);
            int L5 = L4 - gm.L(18.0f);
            this.x.setBounds(L5 - gm.L(11.0f), wi8.D(11.0f, getMeasuredHeight(), 2), L5, (gm.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(gm.N(3.0f), cmb.v0(i, ylbVar));
            this.x.draw(canvas);
        } else if (this.r != null && !z) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - gm.L(116.0f)) - Math.min(uibVar.j() + (hdVar == null ? 0 : gm.L(12.0f) + hdVar.getIntrinsicWidth()), getMeasuredWidth() - gm.L(164.0f)));
            int min = (int) Math.min(this.r.j(), measuredWidth3);
            RectF rectF = gm.P;
            rectF.set(jb6.a0 ? gm.L(15.0f) : kt6.y(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - gm.L(22.0f)) / 2.0f, jb6.a0 ? gm.L(33.0f) + min : getMeasuredWidth() - gm.L(15.0f), (gm.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), this.n);
            uib uibVar2 = this.r;
            uibVar2.p = measuredWidth3;
            uibVar2.e(canvas, jb6.a0 ? gm.L(24.0f) : kt6.y(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : null;
            if (d == null) {
                d = cmb.j0;
            }
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(71.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        x28 x28Var;
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
        this.r = new uib(gw3.m(trim, cmb.n2.getFontMetricsInt(), false, null, 0), 13.0f, gm.o());
        x28 x28Var2 = this.x;
        if (x28Var2 != null) {
            x28Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i = this.a;
        if (z) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i2 = x28.j;
            int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
            x28Var = new x28(i3, i3, i3, tL_emojiStatusCollectible.document_id);
            this.x = x28Var;
        } else {
            if (m9c.n(user) >= 0) {
                x28 c = x28.c(i, m9c.n(user));
                c.a = gm.L(11.0f);
                c.d();
                x28Var = c;
            } else {
                x28Var = null;
            }
            this.x = x28Var;
        }
        if (x28Var != null) {
            x28Var.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        ylb ylbVar = this.d;
        if (z2) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
            int i4 = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.m(i4);
            paint.setColor(cmb.p1(0.1f, i4));
            x28 x28Var3 = new x28(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
            x28Var3.a = gm.L(11.0f);
            x28Var3.d();
            this.y = x28Var3;
            x28Var3.e(this);
            return;
        }
        int f = m9c.f(user);
        if (f < 7) {
            int i5 = cmb.q8[f];
            this.s = i5;
            v0 = cmb.v0(i5, ylbVar);
        } else {
            fc7 fc7Var = oc7.r1(z8c.t0).E3;
            ec7 d = fc7Var != null ? fc7Var.d(f) : null;
            if (d != null) {
                this.s = -1;
                v0 = d.f();
            } else {
                int i6 = cmb.q8[0];
                this.s = i6;
                v0 = cmb.v0(i6, ylbVar);
            }
        }
        this.r.m(v0);
        paint.setColor(cmb.p1(0.1f, v0));
        x28 a2 = x28.a(i, f);
        a2.a = gm.L(11.0f);
        a2.d();
        this.y = a2;
    }

    @Override // vlb
    public final void updateColors() {
        Paint paint;
        int i;
        boolean z = this.b;
        int i2 = z ? cmb.l6 : cmb.p6;
        ylb ylbVar = this.d;
        int v0 = cmb.v0(i2, ylbVar);
        if (!this.E || this.F != v0) {
            this.E = true;
            this.F = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        this.f.m(cmb.v0(z ? cmb.F6 : cmb.p6, ylbVar));
        if (this.r == null || (paint = this.n) == null || (i = this.s) == -1) {
            return;
        }
        int v02 = cmb.v0(i, ylbVar);
        this.r.m(v02);
        paint.setColor(cmb.p1(0.1f, v02));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
