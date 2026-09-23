package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.j01;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final TextView b;
    public final eq c;
    public final r2 d;
    public boolean e;
    public final org.telegram.ui.Components.e6 f;
    public final h90 h;
    public boolean n;

    public h6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        rr rrVar = rr.h;
        this.f = new org.telegram.ui.Components.e6(320L, rrVar);
        this.n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout f7 = ul.f(context, 0);
        addView(f7, w7.x5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        ul.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f7.addView(textView, w7.x5.q(-2, -2, 51));
        eq eqVar = new eq(context);
        this.c = eqVar;
        eqVar.getDrawable().o(true, true, false);
        eqVar.b(0.3f, 165L, rrVar);
        eqVar.setTypeface(AndroidUtilities.bold());
        eqVar.setTextSize(AndroidUtilities.dp(11.0f));
        eqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        eqVar.setGravity(3);
        f7.addView(eqVar, w7.x5.t(-1, 17, 51, 4, 1, 4, 0));
        r2 r2Var = new r2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = r2Var;
        r2Var.setBackgroundColor(0);
        r2Var.setDialogCellDelegate(new e6((j01) this, n2Var, context));
        r2Var.H = 15;
        r2Var.I = 83;
        addView(r2Var, w7.x5.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        h90 h90Var = new h90();
        this.h = h90Var;
        int i10 = org.telegram.ui.ActionBar.h6.i6;
        h90Var.e(org.telegram.ui.ActionBar.h6.l1(1.25f, org.telegram.ui.ActionBar.h6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.h6.l1(0.8f, org.telegram.ui.ActionBar.h6.v0(i10, resourceProvider)));
        h90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        eq eqVar = this.c;
        eqVar.a();
        eqVar.setPivotX(0.0f);
        if (z10) {
            eqVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(rr.h).start();
        } else {
            eqVar.setAlpha(z11 ? 1.0f : 0.0f);
            eqVar.setScaleX(z11 ? 1.0f : 0.0f);
            eqVar.setScaleY(z11 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                formatShortNumber = String.valueOf(i10);
            } else {
                formatShortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            eqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            r2 r2Var = this.d;
            if (z12) {
                r2Var.W(-chat.id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) hg.c.h(1, arrayList);
                long j3 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (r2Var.H0 != j3) {
                    r2Var.t4 = -1;
                }
                r2Var.H0 = j3;
                r2Var.x4 = System.currentTimeMillis();
                r2Var.f1 = messageObject;
                r2Var.u2 = false;
                r2Var.N0 = false;
                r2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                r2Var.S0 = 0;
                r2Var.T0 = false;
                r2Var.l1 = messageObject.getId();
                r2Var.U0 = 0;
                r2Var.V0 = 0;
                r2Var.W0 = 0;
                r2Var.X0 = messageObject.isUnread();
                r2Var.g1 = arrayList;
                MessageObject messageObject2 = r2Var.f1;
                if (messageObject2 != null) {
                    r2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                r2Var.b0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f.e(this.e);
        if (e > 0.0f) {
            h90 h90Var = this.h;
            h90Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            r2 r2Var = this.d;
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(46.33f));
            h90Var.d(rectF);
            h90Var.draw(canvas);
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + r2Var.getX() + AndroidUtilities.dp(r2Var.I + 6), r2Var.getY() + AndroidUtilities.dp(64.33f));
            h90Var.d(rectF);
            h90Var.draw(canvas);
            rectF.set(((r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), r2Var.getY() + AndroidUtilities.dp(12.0f), (r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f), r2Var.getY() + AndroidUtilities.dp(20.33f));
            h90Var.d(rectF);
            h90Var.draw(canvas);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, this.a);
        eq eqVar = this.c;
        eqVar.setTextColor(v02);
        eqVar.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.l1(0.1f, v02)));
        this.b.setTextColor(v02);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
