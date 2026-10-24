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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.wz0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final TextView b;
    public final nq c;
    public final q2 d;
    public boolean e;
    public final org.telegram.ui.Components.f6 f;
    public final ca0 h;
    public boolean n;

    public h6(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getContext());
        bs bsVar = bs.h;
        this.f = new org.telegram.ui.Components.f6(320L, bsVar);
        this.n = false;
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout e = sl.e(context, 0);
        addView(e, w7.z5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        sl.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        e.addView(textView, w7.z5.q(-2, -2, 51));
        nq nqVar = new nq(context);
        this.c = nqVar;
        nqVar.getDrawable().r(true, true);
        nqVar.b(0.3f, 165L, bsVar);
        nqVar.setTypeface(AndroidUtilities.bold());
        nqVar.setTextSize(AndroidUtilities.dp(11.0f));
        nqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        nqVar.setGravity(3);
        e.addView(nqVar, w7.z5.t(-1, 17, 51, 4, 1, 4, 0));
        q2 q2Var = new q2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = q2Var;
        q2Var.setBackgroundColor(0);
        q2Var.setDialogCellDelegate(new e6((wz0) this, o2Var, context));
        q2Var.H = 15;
        q2Var.I = 83;
        addView(q2Var, w7.z5.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        ca0 ca0Var = new ca0();
        this.h = ca0Var;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        ca0Var.f(org.telegram.ui.ActionBar.k6.o1(1.25f, org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.w0(i10, resourceProvider)));
        ca0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        nq nqVar = this.c;
        nqVar.a();
        nqVar.setPivotX(0.0f);
        if (z10) {
            nqVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(bs.h).start();
        } else {
            nqVar.setAlpha(z11 ? 1.0f : 0.0f);
            nqVar.setScaleX(z11 ? 1.0f : 0.0f);
            nqVar.setScaleY(z11 ? 1.0f : 0.0f);
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
            nqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            q2 q2Var = this.d;
            if (z12) {
                q2Var.V(-chat.id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
                long j10 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (q2Var.H0 != j10) {
                    q2Var.x4 = -1;
                }
                q2Var.H0 = j10;
                q2Var.B4 = System.currentTimeMillis();
                q2Var.f1 = messageObject;
                q2Var.u2 = false;
                q2Var.N0 = false;
                q2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                q2Var.S0 = 0;
                q2Var.T0 = false;
                q2Var.l1 = messageObject.getId();
                q2Var.U0 = 0;
                q2Var.V0 = 0;
                q2Var.W0 = 0;
                q2Var.X0 = messageObject.isUnread();
                q2Var.g1 = arrayList;
                MessageObject messageObject2 = q2Var.f1;
                if (messageObject2 != null) {
                    q2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                q2Var.a0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f.e(this.e);
        if (e > 0.0f) {
            ca0 ca0Var = this.h;
            ca0Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            q2 q2Var = this.d;
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(46.33f));
            ca0Var.e(rectF);
            ca0Var.draw(canvas);
            rectF.set(q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + q2Var.getX() + AndroidUtilities.dp(q2Var.I + 6), q2Var.getY() + AndroidUtilities.dp(64.33f));
            ca0Var.e(rectF);
            ca0Var.draw(canvas);
            rectF.set(((q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), q2Var.getY() + AndroidUtilities.dp(12.0f), (q2Var.getX() + q2Var.getWidth()) - AndroidUtilities.dp(16.0f), q2Var.getY() + AndroidUtilities.dp(20.33f));
            ca0Var.e(rectF);
            ca0Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, this.a);
        nq nqVar = this.c;
        nqVar.setTextColor(w02);
        nqVar.setBackground(org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.k6.o1(0.1f, w02)));
        this.b.setTextColor(w02);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
