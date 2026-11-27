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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class j38 extends View implements snb {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final vnb d;
    public final Drawable e;
    public final pkb f;
    public final hc h;
    public final Paint n;
    public pkb r;
    public int s;
    public boolean w;
    public b48 x;
    public b48 y;

    public j38(int i, long j, vnb vnbVar, Context context) {
        super(context);
        int i2;
        this.n = new Paint(1);
        this.s = -1;
        uc7 s1 = uc7.s1(i);
        hr hrVar = s1.k4;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(-j));
        this.a = i;
        boolean z = j < 0;
        this.b = z;
        boolean z2 = z && !xc2.V(M0);
        this.c = z2;
        this.d = vnbVar;
        Drawable e = c00.e(context, R.drawable.menu_edit_appearance);
        this.e = e;
        yob.x(this, e, aob.q6, vnbVar, PorterDuff.Mode.SRC_IN);
        String M02 = ob6.M0(z ? z2 ? 2131752527 : 2131752532 : 2131752511, null);
        if (z && !z2 && uc7.s1(i).X3.getInt("boostingappearance", 0) < 3) {
            lc7 lc7Var = s1.E3;
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (lc7Var != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, lc7Var.e(false));
                int max = Math.max(0, s1.E3.e(false));
                int min2 = Math.min(min, s1.E3.f());
                int max2 = Math.max(max, s1.E3.f());
                i3 = min2;
                i2 = max2;
            } else {
                i2 = 0;
            }
            ds2 ds2Var = hrVar.d2;
            ds2 ds2Var2 = hrVar.o2;
            ds2 ds2Var3 = hrVar.n2;
            ds2 ds2Var4 = hrVar.f2;
            ds2 ds2Var5 = hrVar.e2;
            int min3 = Math.min(i3, ds2Var.f());
            int min4 = Math.min(i2, hrVar.d2.f());
            lc7 lc7Var2 = s1.F3;
            if (lc7Var2 != null) {
                int min5 = Math.min(min3, lc7Var2.e(false));
                int max3 = Math.max(min4, s1.F3.e(false));
                min3 = Math.min(min5, s1.F3.f());
                min4 = Math.max(max3, s1.F3.f());
            }
            int min6 = Math.min(min3, ds2Var5.f());
            int max4 = Math.max(min4, ds2Var5.f());
            int min7 = Math.min(min6, ds2Var4.f());
            int max5 = Math.max(max4, ds2Var4.f());
            int min8 = Math.min(min7, ds2Var3.f());
            int max6 = Math.max(max5, ds2Var3.f());
            int min9 = Math.min(min8, ds2Var2.f());
            int max7 = Math.max(max6, ds2Var2.f());
            int i4 = M0 != null ? M0.level : 0;
            if (i4 < max7) {
                this.h = new hc(Math.max(i4, min9), vnbVar, context, true);
            }
        }
        setContentDescription(M02);
        this.f = new pkb(M02, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = hl.L(64.0f) / 2;
        if (ob6.a0) {
            L = getMeasuredWidth() - L;
        }
        Drawable drawable = this.e;
        br3.d(drawable, L, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - hl.L(171.0f);
        hc hcVar = this.h;
        int L2 = hcVar != null ? hl.L(8.0f) + hcVar.getIntrinsicWidth() : 0;
        pkb pkbVar = this.f;
        pkbVar.p = measuredWidth - L2;
        float measuredWidth2 = ob6.a0 ? (getMeasuredWidth() - pkbVar.j()) - hl.L(71.0f) : hl.L(71.0f);
        pkbVar.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (hcVar != null) {
            int j = (int) (pkbVar.j() + measuredWidth2 + hl.L(6.0f));
            hcVar.setBounds(j, 0, j, getHeight());
            hcVar.draw(canvas);
        }
        vnb vnbVar = this.d;
        boolean z = this.c;
        if (z && this.y != null) {
            int L3 = ob6.a0 ? hl.L(58.0f) : getMeasuredWidth() - hl.L(24.0f);
            this.y.setBounds(L3 - hl.L(11.0f), ik8.D(11.0f, getMeasuredHeight(), 2), L3, (hl.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(hl.N(3.0f), aob.v0(aob.d6, vnbVar));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            int L4 = ob6.a0 ? hl.L(58.0f) : getMeasuredWidth() - hl.L(24.0f);
            this.y.setBounds(L4 - hl.L(11.0f), ik8.D(11.0f, getMeasuredHeight(), 2), L4, (hl.L(11.0f) + getMeasuredHeight()) / 2);
            b48 b48Var = this.y;
            float N = hl.N(3.0f);
            int i = aob.d6;
            b48Var.f(N, aob.v0(i, vnbVar));
            this.y.draw(canvas);
            int L5 = L4 - hl.L(18.0f);
            this.x.setBounds(L5 - hl.L(11.0f), ik8.D(11.0f, getMeasuredHeight(), 2), L5, (hl.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(hl.N(3.0f), aob.v0(i, vnbVar));
            this.x.draw(canvas);
        } else if (this.r != null && !z) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - hl.L(116.0f)) - Math.min(pkbVar.j() + (hcVar == null ? 0 : hl.L(12.0f) + hcVar.getIntrinsicWidth()), getMeasuredWidth() - hl.L(164.0f)));
            int min = (int) Math.min(this.r.j(), measuredWidth3);
            RectF rectF = hl.P;
            rectF.set(ob6.a0 ? hl.L(15.0f) : qu6.x(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - hl.L(22.0f)) / 2.0f, ob6.a0 ? hl.L(33.0f) + min : getMeasuredWidth() - hl.L(15.0f), (hl.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), this.n);
            pkb pkbVar2 = this.r;
            pkbVar2.p = measuredWidth3;
            pkbVar2.e(canvas, ob6.a0 ? hl.L(24.0f) : qu6.x(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            Paint d = vnbVar != null ? vnbVar.d("paintDivider") : null;
            if (d == null) {
                d = aob.j0;
            }
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(71.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(50.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        b48 b48Var;
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
        this.r = new pkb(pv3.m(trim, aob.o2.getFontMetricsInt(), false, null, 0), 13.0f, hl.o());
        b48 b48Var2 = this.x;
        if (b48Var2 != null) {
            b48Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i = this.a;
        if (z) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i2 = b48.j;
            int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
            b48Var = new b48(i3, i3, i3, tL_emojiStatusCollectible.document_id);
            this.x = b48Var;
        } else {
            if (lbc.n(user) >= 0) {
                b48 c = b48.c(i, lbc.n(user));
                c.a = hl.L(11.0f);
                c.d();
                b48Var = c;
            } else {
                b48Var = null;
            }
            this.x = b48Var;
        }
        if (b48Var != null) {
            b48Var.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        vnb vnbVar = this.d;
        if (z2) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
            int i4 = (!a || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.m(i4);
            paint.setColor(aob.p1(0.1f, i4));
            b48 b48Var3 = new b48(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
            b48Var3.a = hl.L(11.0f);
            b48Var3.d();
            this.y = b48Var3;
            b48Var3.e(this);
            return;
        }
        int f = lbc.f(user);
        if (f < 7) {
            int i5 = aob.r8[f];
            this.s = i5;
            v0 = aob.v0(i5, vnbVar);
        } else {
            lc7 lc7Var = uc7.s1(yac.t0).E3;
            kc7 d = lc7Var != null ? lc7Var.d(f) : null;
            if (d != null) {
                this.s = -1;
                v0 = d.f();
            } else {
                int i6 = aob.r8[0];
                this.s = i6;
                v0 = aob.v0(i6, vnbVar);
            }
        }
        this.r.m(v0);
        paint.setColor(aob.p1(0.1f, v0));
        b48 a2 = b48.a(i, f);
        a2.a = hl.L(11.0f);
        a2.d();
        this.y = a2;
    }

    @Override // snb
    public final void updateColors() {
        Paint paint;
        int i;
        boolean z = this.b;
        int i2 = z ? aob.m6 : aob.q6;
        vnb vnbVar = this.d;
        int v0 = aob.v0(i2, vnbVar);
        if (!this.E || this.F != v0) {
            this.E = true;
            this.F = v0;
            this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        this.f.m(aob.v0(z ? aob.G6 : aob.q6, vnbVar));
        if (this.r == null || (paint = this.n) == null || (i = this.s) == -1) {
            return;
        }
        int v02 = aob.v0(i, vnbVar);
        this.r.m(v02);
        paint.setColor(aob.p1(0.1f, v02));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
