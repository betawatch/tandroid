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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xp;
import org.telegram.ui.mz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class e6 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 a;
    public final TextView b;
    public final xp c;
    public final p2 d;
    public boolean e;
    public final org.telegram.ui.Components.d6 f;
    public final c90 h;
    public boolean n;

    public e6(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext());
        jr jrVar = jr.h;
        this.f = new org.telegram.ui.Components.d6(320L, jrVar);
        this.n = false;
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = o2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        addView(g10, i7.f6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.g(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        g10.addView(textView, i7.f6.q(-2, -2, 51));
        xp xpVar = new xp(context);
        this.c = xpVar;
        xpVar.getDrawable().o(true, true, false);
        xpVar.b(0.3f, 165L, jrVar);
        xpVar.setTypeface(AndroidUtilities.bold());
        xpVar.setTextSize(AndroidUtilities.dp(11.0f));
        xpVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        xpVar.setGravity(3);
        g10.addView(xpVar, i7.f6.t(-1, 17, 51, 4, 1, 4, 0));
        p2 p2Var = new p2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setDialogCellDelegate(new b6((mz0) this, o2Var, context));
        p2Var.D = 15;
        p2Var.E = 83;
        addView(p2Var, i7.f6.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        c90 c90Var = new c90();
        this.h = c90Var;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        c90Var.e(org.telegram.ui.ActionBar.g6.l1(1.25f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)));
        c90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        xp xpVar = this.c;
        xpVar.a();
        xpVar.setPivotX(0.0f);
        if (z10) {
            xpVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(jr.h).start();
        } else {
            xpVar.setAlpha(z11 ? 1.0f : 0.0f);
            xpVar.setScaleX(z11 ? 1.0f : 0.0f);
            xpVar.setScaleY(z11 ? 1.0f : 0.0f);
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
            xpVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            p2 p2Var = this.d;
            if (z12) {
                p2Var.W(-chat.id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
                long j10 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (p2Var.D0 != j10) {
                    p2Var.p4 = -1;
                }
                p2Var.D0 = j10;
                p2Var.t4 = System.currentTimeMillis();
                p2Var.b1 = messageObject;
                p2Var.q2 = false;
                p2Var.J0 = false;
                p2Var.N0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                p2Var.O0 = 0;
                p2Var.P0 = false;
                p2Var.h1 = messageObject.getId();
                p2Var.Q0 = 0;
                p2Var.R0 = 0;
                p2Var.S0 = 0;
                p2Var.T0 = messageObject.isUnread();
                p2Var.c1 = arrayList;
                MessageObject messageObject2 = p2Var.b1;
                if (messageObject2 != null) {
                    p2Var.U0 = messageObject2.messageOwner.send_state;
                }
                p2Var.b0(0, z10);
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
        float e10 = this.f.e(this.e);
        if (e10 > 0.0f) {
            c90 c90Var = this.h;
            c90Var.setAlpha((int) (e10 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.d;
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(46.33f));
            c90Var.d(rectF);
            c90Var.draw(canvas);
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(64.33f));
            c90Var.d(rectF);
            c90Var.draw(canvas);
            rectF.set(((p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), p2Var.getY() + AndroidUtilities.dp(12.0f), (p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f), p2Var.getY() + AndroidUtilities.dp(20.33f));
            c90Var.d(rectF);
            c90Var.draw(canvas);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.a);
        xp xpVar = this.c;
        xpVar.setTextColor(v02);
        xpVar.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.l1(0.1f, v02)));
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
