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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class f6 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final TextView b;
    public final aq c;
    public final q2 d;
    public boolean e;
    public final org.telegram.ui.Components.z5 f;
    public final j90 h;
    public boolean n;

    public f6(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getContext());
        mr mrVar = mr.h;
        this.f = new org.telegram.ui.Components.z5(320L, mrVar);
        this.n = false;
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, k7.b6.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.b.g(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        f10.addView(textView, k7.b6.q(-2, -2, 51));
        aq aqVar = new aq(context);
        this.c = aqVar;
        aqVar.getDrawable().o(true, true, false);
        aqVar.b(0.3f, 165L, mrVar);
        aqVar.setTypeface(AndroidUtilities.bold());
        aqVar.setTextSize(AndroidUtilities.dp(11.0f));
        aqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        aqVar.setGravity(3);
        f10.addView(aqVar, k7.b6.t(-1, 17, 51, 4, 1, 4, 0));
        q2 q2Var = new q2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = q2Var;
        q2Var.setBackgroundColor(0);
        q2Var.setDialogCellDelegate(new c6((e01) this, p2Var, context));
        q2Var.E = 15;
        q2Var.F = 83;
        addView(q2Var, k7.b6.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        j90 j90Var = new j90();
        this.h = j90Var;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        j90Var.e(org.telegram.ui.ActionBar.j6.l1(1.25f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.v0(i10, resourceProvider)));
        j90Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z4 = this.n;
        boolean z10 = chat == null || chat.participants_count > 0;
        aq aqVar = this.c;
        aqVar.a();
        aqVar.setPivotX(0.0f);
        if (z4) {
            aqVar.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(mr.h).start();
        } else {
            aqVar.setAlpha(z10 ? 1.0f : 0.0f);
            aqVar.setScaleX(z10 ? 1.0f : 0.0f);
            aqVar.setScaleY(z10 ? 1.0f : 0.0f);
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
            aqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z11 = arrayList == null || arrayList.isEmpty();
            this.e = z11;
            q2 q2Var = this.d;
            if (z11) {
                q2Var.W(-chat.id, null, 0, false, z4);
            } else {
                MessageObject messageObject = (MessageObject) kf.k0.i(1, arrayList);
                long j10 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (q2Var.E0 != j10) {
                    q2Var.q4 = -1;
                }
                q2Var.E0 = j10;
                q2Var.u4 = System.currentTimeMillis();
                q2Var.c1 = messageObject;
                q2Var.r2 = false;
                q2Var.K0 = false;
                q2Var.O0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                q2Var.P0 = 0;
                q2Var.Q0 = false;
                q2Var.i1 = messageObject.getId();
                q2Var.R0 = 0;
                q2Var.S0 = 0;
                q2Var.T0 = 0;
                q2Var.U0 = messageObject.isUnread();
                q2Var.d1 = arrayList;
                MessageObject messageObject2 = q2Var.c1;
                if (messageObject2 != null) {
                    q2Var.V0 = messageObject2.messageOwner.send_state;
                }
                q2Var.b0(0, z4);
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
        float e = this.f.e(this.e);
        if (e > 0.0f) {
            j90 j90Var = this.h;
            j90Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            q2 q2Var = this.d;
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(46.33f));
            j90Var.d(rectF);
            j90Var.draw(canvas);
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + q2Var.getX() + AndroidUtilities.dp(q2Var.F + 6), q2Var.getY() + AndroidUtilities.dp(64.33f));
            j90Var.d(rectF);
            j90Var.draw(canvas);
            rectF.set(((q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), q2Var.getY() + AndroidUtilities.dp(12.0f), (q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f), q2Var.getY() + AndroidUtilities.dp(20.33f));
            j90Var.d(rectF);
            j90Var.draw(canvas);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.a);
        aq aqVar = this.c;
        aqVar.setTextColor(v02);
        aqVar.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, v02)));
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
