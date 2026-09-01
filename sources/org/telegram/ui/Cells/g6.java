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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.zz0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class g6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final TextView b;
    public final dq c;
    public final r2 d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f;
    public final k90 h;
    public boolean n;

    public g6(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getContext());
        pr prVar = pr.h;
        this.f = new org.telegram.ui.Components.z5(320L, prVar);
        this.n = false;
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = p2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, k7.c6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.g(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f10.addView(textView, k7.c6.q(-2, -2, 51));
        dq dqVar = new dq(context);
        this.c = dqVar;
        dqVar.getDrawable().o(true, true, false);
        dqVar.b(0.3f, 165L, prVar);
        dqVar.setTypeface(AndroidUtilities.bold());
        dqVar.setTextSize(AndroidUtilities.dp(11.0f));
        dqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        dqVar.setGravity(3);
        f10.addView(dqVar, k7.c6.t(-1, 17, 51, 4, 1, 4, 0));
        r2 r2Var = new r2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = r2Var;
        r2Var.setBackgroundColor(0);
        r2Var.setDialogCellDelegate(new d6((zz0) this, p2Var, context));
        r2Var.E = 15;
        r2Var.F = 83;
        addView(r2Var, k7.c6.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        k90 k90Var = new k90();
        this.h = k90Var;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        k90Var.e(org.telegram.ui.ActionBar.k6.l1(1.25f, org.telegram.ui.ActionBar.k6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.k6.l1(0.8f, org.telegram.ui.ActionBar.k6.v0(i10, resourceProvider)));
        k90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z4 = this.n;
        boolean z10 = chat == null || chat.participants_count > 0;
        dq dqVar = this.c;
        dqVar.a();
        dqVar.setPivotX(0.0f);
        if (z4) {
            dqVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(pr.h).start();
        } else {
            dqVar.setAlpha(z10 ? 1.0f : 0.0f);
            dqVar.setScaleX(z10 ? 1.0f : 0.0f);
            dqVar.setScaleY(z10 ? 1.0f : 0.0f);
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
            dqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z11 = arrayList == null || arrayList.isEmpty();
            this.e = z11;
            r2 r2Var = this.d;
            if (z11) {
                r2Var.W(-chat.id, null, 0, false, z4);
            } else {
                MessageObject messageObject = (MessageObject) l.d.i(1, arrayList);
                long j10 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (r2Var.E0 != j10) {
                    r2Var.q4 = -1;
                }
                r2Var.E0 = j10;
                r2Var.u4 = System.currentTimeMillis();
                r2Var.c1 = messageObject;
                r2Var.r2 = false;
                r2Var.K0 = false;
                r2Var.O0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                r2Var.P0 = 0;
                r2Var.Q0 = false;
                r2Var.i1 = messageObject.getId();
                r2Var.R0 = 0;
                r2Var.S0 = 0;
                r2Var.T0 = 0;
                r2Var.U0 = messageObject.isUnread();
                r2Var.d1 = arrayList;
                MessageObject messageObject2 = r2Var.c1;
                if (messageObject2 != null) {
                    r2Var.V0 = messageObject2.messageOwner.send_state;
                }
                r2Var.b0(0, z4);
            }
        }
        if (!z4) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e6 = this.f.e(this.e);
        if (e6 > 0.0f) {
            k90 k90Var = this.h;
            k90Var.setAlpha((int) (e6 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            r2 r2Var = this.d;
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(46.33f));
            k90Var.d(rectF);
            k90Var.draw(canvas);
            rectF.set(r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + r2Var.getX() + AndroidUtilities.dp(r2Var.F + 6), r2Var.getY() + AndroidUtilities.dp(64.33f));
            k90Var.d(rectF);
            k90Var.draw(canvas);
            rectF.set(((r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), r2Var.getY() + AndroidUtilities.dp(12.0f), (r2Var.getX() + r2Var.getWidth()) - AndroidUtilities.dp(16.0f), r2Var.getY() + AndroidUtilities.dp(20.33f));
            k90Var.d(rectF);
            k90Var.draw(canvas);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, this.a);
        dq dqVar = this.c;
        dqVar.setTextColor(v02);
        dqVar.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.k6.l1(0.1f, v02)));
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
