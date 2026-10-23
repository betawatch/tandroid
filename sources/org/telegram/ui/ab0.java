package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ab0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.l4 E;
    public wa0 F;
    public org.telegram.ui.Cells.d9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ba I;
    public org.telegram.ui.Components.xo0 J;
    public wa0 K;
    public org.telegram.ui.Cells.d9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public za0 T;
    public org.telegram.ui.ActionBar.b2 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.pw0 c;
    public org.telegram.ui.Components.pw0 d;
    public TLRPC.TL_chatInviteExported e;
    public xa0 f;
    public org.telegram.ui.Cells.d9 h;
    public org.telegram.ui.Cells.v8 n;
    public ya0 r;
    public TextView s;
    public org.telegram.ui.Cells.d9 v;
    public TextView w;
    public org.telegram.ui.Cells.l4 x;
    public org.telegram.ui.Cells.d9 y;

    public ab0(int i10, long j10) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.a = i10;
        this.b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.Q;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.gms.internal.play_billing.k3.f(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i14] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j11 < 31449600) {
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(1000 * j10);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(1000 * j10);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.S;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = com.google.android.gms.internal.play_billing.k3.f(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i10 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            i10 = com.google.android.gms.internal.play_billing.k3.f(iArr[i10], i10, 1, arrayList);
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i10 = tL_chatInviteExported.expire_date;
        if (i10 > 0) {
            V(i10);
            this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.W = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            W(i11);
            this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        xa0 xa0Var = this.f;
        if (xa0Var != null) {
            xa0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
            this.K.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.v8 v8Var = this.n;
        if (v8Var != null) {
            v8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            xa0 xa0Var2 = this.f;
            if (xa0Var2 != null) {
                xa0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.d9 d9Var = this.h;
            if (d9Var != null) {
                d9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        ya0 ya0Var = this.r;
        if (ya0Var != null) {
            ya0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.b.setClickable(false);
            this.r.b.setFocusable(false);
            this.r.b.setFocusableInTouchMode(false);
            this.r.b.setLongClickable(false);
        }
    }

    public final void Z(boolean z10) {
        this.E.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.F.setVisibility(z10 ? 0 : 8);
        this.G.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.a;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 6));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.h5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        final int i11 = 0;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ta0
            public final /* synthetic */ ab0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x028b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                long j10;
                int i12;
                boolean z10;
                boolean z11;
                xa0 xa0Var;
                String obj;
                switch (i11) {
                    case 0:
                        final ab0 ab0Var = this.b;
                        long j11 = ab0Var.b;
                        ArrayList arrayList = ab0Var.R;
                        ArrayList arrayList2 = ab0Var.P;
                        if (!ab0Var.V) {
                            int selectedIndex = ab0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(ab0Var.w);
                                Vibrator vibrator = (Vibrator) ab0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.v8 v8Var = ab0Var.n;
                                if (v8Var != null && v8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(ab0Var.r.b.getText().toString());
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    i12 = ab0Var.a;
                                    if (i12 != 0) {
                                        org.telegram.ui.ActionBar.b2 b2Var = ab0Var.U;
                                        if (b2Var != null) {
                                            b2Var.dismiss();
                                        }
                                        ab0Var.V = true;
                                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(ab0Var.getParentActivity(), 3, null);
                                        ab0Var.U = b2Var2;
                                        b2Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = ab0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = ab0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = ab0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = ab0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        xa0 xa0Var2 = ab0Var.f;
                                        boolean z12 = xa0Var2 != null && xa0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = ab0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = ab0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        final int i13 = 0;
                                        ab0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ra0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final ab0 ab0Var2 = ab0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        ab0 ab0Var3 = ab0Var2;
                                                                        ab0Var3.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = ab0Var3.U;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.f5.t0(ab0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            za0 za0Var = ab0Var3.T;
                                                                            if (za0Var != null) {
                                                                                za0Var.c(tLObject);
                                                                            }
                                                                            ab0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        ab0 ab0Var4 = ab0Var2;
                                                                        ab0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = ab0Var4.U;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            za0 za0Var2 = ab0Var4.T;
                                                                            if (za0Var2 != null) {
                                                                                za0Var2.b(ab0Var4.e, tLObject2);
                                                                            }
                                                                            ab0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final ab0 ab0Var3 = ab0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        ab0 ab0Var32 = ab0Var3;
                                                                        ab0Var32.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = ab0Var32.U;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            za0 za0Var = ab0Var32.T;
                                                                            if (za0Var != null) {
                                                                                za0Var.c(tLObject);
                                                                            }
                                                                            ab0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        ab0 ab0Var4 = ab0Var3;
                                                                        ab0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = ab0Var4.U;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            za0 za0Var2 = ab0Var4.T;
                                                                            if (za0Var2 != null) {
                                                                                za0Var2.b(ab0Var4.e, tLObject2);
                                                                            }
                                                                            ab0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    } else if (i12 == 1) {
                                        org.telegram.ui.ActionBar.b2 b2Var3 = ab0Var.U;
                                        if (b2Var3 != null) {
                                            b2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = ab0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = ab0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = ab0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (ab0Var.W != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = ab0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (ab0Var.W != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = ab0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (ab0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = ab0Var.e.request_needed;
                                            xa0Var = ab0Var.f;
                                            if (z11 != (xa0Var == null && xa0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z13 = xa0Var != null && xa0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = ab0Var.K.getText().toString();
                                            if (!TextUtils.equals(ab0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                ab0Var.V = true;
                                                org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(ab0Var.getParentActivity(), 3, null);
                                                ab0Var.U = b2Var4;
                                                b2Var4.r(500L);
                                                final int i15 = 1;
                                                ab0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ra0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final ab0 ab0Var2 = ab0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                ab0 ab0Var32 = ab0Var2;
                                                                                ab0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = ab0Var32.U;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    za0 za0Var = ab0Var32.T;
                                                                                    if (za0Var != null) {
                                                                                        za0Var.c(tLObject);
                                                                                    }
                                                                                    ab0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                ab0 ab0Var4 = ab0Var2;
                                                                                ab0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = ab0Var4.U;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    za0 za0Var2 = ab0Var4.T;
                                                                                    if (za0Var2 != null) {
                                                                                        za0Var2.b(ab0Var4.e, tLObject2);
                                                                                    }
                                                                                    ab0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final ab0 ab0Var3 = ab0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                ab0 ab0Var32 = ab0Var3;
                                                                                ab0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = ab0Var32.U;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    za0 za0Var = ab0Var32.T;
                                                                                    if (za0Var != null) {
                                                                                        za0Var.c(tLObject);
                                                                                    }
                                                                                    ab0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                ab0 ab0Var4 = ab0Var3;
                                                                                ab0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = ab0Var4.U;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    za0 za0Var2 = ab0Var4.T;
                                                                                    if (za0Var2 != null) {
                                                                                        za0Var2.b(ab0Var4.e, tLObject2);
                                                                                    }
                                                                                    ab0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            } else {
                                                ab0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (ab0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = ab0Var.e.request_needed;
                                            xa0Var = ab0Var.f;
                                            if (z11 != (xa0Var == null && xa0Var.e.h)) {
                                            }
                                            obj = ab0Var.K.getText().toString();
                                            if (!TextUtils.equals(ab0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i12 = ab0Var.a;
                                if (i12 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        ab0 ab0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ab0Var2.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new qa0(ab0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ab0Var2.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        this.M.setSingleLine();
        if (i10 == 0) {
            this.M.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i10 == 1) {
            this.M.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.b6.a(this.M);
        this.actionBar.addView(this.M, w7.z5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        va0 va0Var = new va0(this, context);
        org.telegram.ui.Components.xo0 xo0Var = new org.telegram.ui.Components.xo0(context, va0Var, this.resourceProvider, true);
        this.J = xo0Var;
        this.actionBar.setAdaptiveBackground(xo0Var);
        y8 y8Var = new y8(this, context, 4);
        this.fragmentView = y8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        layoutTransition.setInterpolator(2, bsVar);
        layoutTransition.setInterpolator(0, bsVar);
        layoutTransition.setInterpolator(4, bsVar);
        layoutTransition.setInterpolator(1, bsVar);
        int i12 = 3;
        layoutTransition.setInterpolator(3, bsVar);
        va0Var.setLayoutTransition(layoutTransition);
        va0Var.setOrientation(1);
        va0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(va0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        va0Var.addView(this.x);
        org.telegram.ui.Components.pw0 pw0Var = new org.telegram.ui.Components.pw0(context, null);
        this.d = pw0Var;
        va0Var.addView(pw0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new org.telegram.ui.Components.i51(24, this, context));
        this.d.setCallback(new qa0(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = com.google.android.gms.internal.play_billing.k3.f(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        va0Var.addView(this.w, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.y = d9Var;
        d9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        va0Var.addView(this.y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.E = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        va0Var.addView(this.E);
        org.telegram.ui.Components.pw0 pw0Var2 = new org.telegram.ui.Components.pw0(context, null);
        this.c = pw0Var2;
        pw0Var2.setCallback(new qa0(this, i12));
        X();
        va0Var.addView(this.c);
        wa0 wa0Var = new wa0(context, 0);
        this.F = wa0Var;
        wa0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new ua0(this, 1));
        va0Var.addView(this.F, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.G = d9Var2;
        d9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        va0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        xa0 xa0Var = new xa0(context);
        this.f = xa0Var;
        int i14 = org.telegram.ui.ActionBar.h6.d6;
        xa0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.f.setTag(Integer.valueOf(i14));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new ci.h2(7, this, z10));
        va0Var.addView(this.f, w7.z5.n(-1, 56));
        org.telegram.ui.Cells.d9 d9Var3 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.h = d9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            d9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        va0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
                this.n = v8Var;
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new org.telegram.ui.Components.i51(25, this, new Runnable[1]));
                va0Var.addView(this.n, w7.z5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
                ya0 ya0Var = new ya0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = ya0Var;
                ya0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i14));
                ya0 ya0Var2 = this.r;
                ya0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(ya0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = ya0Var2.b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.t2(gVar, 2));
                this.r.addView(this.s, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                ya0 ya0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                ya0Var3.getClass();
                ImageView imageView = new ImageView(ya0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                ya0Var3.addView(imageView, w7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = ya0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                va0Var.addView(this.r, w7.z5.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.d9 d9Var4 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
                this.v = d9Var4;
                if (this.e != null) {
                    d9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    d9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new pa0(this, 2)));
                }
                va0Var.addView(this.v, w7.z5.n(-1, -2));
            }
        }
        wa0 wa0Var2 = new wa0(context, 1);
        this.K = wa0Var2;
        wa0Var2.addTextChangedListener(new ua0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        wa0 wa0Var3 = this.K;
        int i15 = org.telegram.ui.ActionBar.h6.y6;
        wa0Var3.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        wa0 wa0Var4 = this.K;
        int i16 = org.telegram.ui.ActionBar.h6.G6;
        wa0Var4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        this.K.setTextSize(1, 16.0f);
        va0Var.addView(this.K, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.d9 d9Var5 = new org.telegram.ui.Cells.d9(context, 12, this.resourceProvider);
        this.L = d9Var5;
        d9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        va0Var.addView(this.L);
        if (i10 == 1) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.I = baVar;
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
            final int i17 = 1;
            this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ta0
                public final /* synthetic */ ab0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x028b  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    long j102;
                    int i122;
                    boolean z102;
                    boolean z11;
                    xa0 xa0Var2;
                    String obj;
                    switch (i17) {
                        case 0:
                            final ab0 ab0Var = this.b;
                            long j11 = ab0Var.b;
                            ArrayList arrayList2 = ab0Var.R;
                            ArrayList arrayList22 = ab0Var.P;
                            if (!ab0Var.V) {
                                int selectedIndex = ab0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(ab0Var.w);
                                    Vibrator vibrator = (Vibrator) ab0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.v8 v8Var2 = ab0Var.n;
                                    if (v8Var2 != null && v8Var2.e.h) {
                                        try {
                                            j102 = Long.parseLong(ab0Var.r.b.getText().toString());
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        i122 = ab0Var.a;
                                        if (i122 != 0) {
                                            org.telegram.ui.ActionBar.b2 b2Var = ab0Var.U;
                                            if (b2Var != null) {
                                                b2Var.dismiss();
                                            }
                                            ab0Var.V = true;
                                            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(ab0Var.getParentActivity(), 3, null);
                                            ab0Var.U = b2Var2;
                                            b2Var2.r(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = ab0Var.getMessagesController().getInputPeer(-j11);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = ab0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = ab0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = ab0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            xa0 xa0Var22 = ab0Var.f;
                                            boolean z12 = xa0Var22 != null && xa0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = ab0Var.K.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j102 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = ab0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j102;
                                            }
                                            final int i132 = 0;
                                            ab0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ra0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i132) {
                                                        case 0:
                                                            final int i142 = 0;
                                                            final ab0 ab0Var2 = ab0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i142) {
                                                                        case 0:
                                                                            ab0 ab0Var32 = ab0Var2;
                                                                            ab0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = ab0Var32.U;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                za0 za0Var = ab0Var32.T;
                                                                                if (za0Var != null) {
                                                                                    za0Var.c(tLObject);
                                                                                }
                                                                                ab0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            ab0 ab0Var4 = ab0Var2;
                                                                            ab0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = ab0Var4.U;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                za0 za0Var2 = ab0Var4.T;
                                                                                if (za0Var2 != null) {
                                                                                    za0Var2.b(ab0Var4.e, tLObject2);
                                                                                }
                                                                                ab0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i152 = 1;
                                                            final ab0 ab0Var3 = ab0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            ab0 ab0Var32 = ab0Var3;
                                                                            ab0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = ab0Var32.U;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                za0 za0Var = ab0Var32.T;
                                                                                if (za0Var != null) {
                                                                                    za0Var.c(tLObject);
                                                                                }
                                                                                ab0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            ab0 ab0Var4 = ab0Var3;
                                                                            ab0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = ab0Var4.U;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                za0 za0Var2 = ab0Var4.T;
                                                                                if (za0Var2 != null) {
                                                                                    za0Var2.b(ab0Var4.e, tLObject2);
                                                                                }
                                                                                ab0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else if (i122 == 1) {
                                            org.telegram.ui.ActionBar.b2 b2Var3 = ab0Var.U;
                                            if (b2Var3 != null) {
                                                b2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = ab0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = ab0Var.getMessagesController().getInputPeer(-j11);
                                            int selectedIndex4 = ab0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (ab0Var.W != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = ab0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (ab0Var.W != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = ab0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (ab0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = ab0Var.e.request_needed;
                                                xa0Var2 = ab0Var.f;
                                                if (z11 != (xa0Var2 == null && xa0Var2.e.h)) {
                                                    int i142 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i142 | 8;
                                                    boolean z13 = xa0Var2 != null && xa0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i142 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = ab0Var.K.getText().toString();
                                                if (!TextUtils.equals(ab0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    ab0Var.V = true;
                                                    org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(ab0Var.getParentActivity(), 3, null);
                                                    ab0Var.U = b2Var4;
                                                    b2Var4.r(500L);
                                                    final int i152 = 1;
                                                    ab0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ra0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i152) {
                                                                case 0:
                                                                    final int i1422 = 0;
                                                                    final ab0 ab0Var2 = ab0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1422) {
                                                                                case 0:
                                                                                    ab0 ab0Var32 = ab0Var2;
                                                                                    ab0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = ab0Var32.U;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        za0 za0Var = ab0Var32.T;
                                                                                        if (za0Var != null) {
                                                                                            za0Var.c(tLObject);
                                                                                        }
                                                                                        ab0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    ab0 ab0Var4 = ab0Var2;
                                                                                    ab0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = ab0Var4.U;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        za0 za0Var2 = ab0Var4.T;
                                                                                        if (za0Var2 != null) {
                                                                                            za0Var2.b(ab0Var4.e, tLObject2);
                                                                                        }
                                                                                        ab0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1522 = 1;
                                                                    final ab0 ab0Var3 = ab0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sa0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    ab0 ab0Var32 = ab0Var3;
                                                                                    ab0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = ab0Var32.U;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.f5.t0(ab0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        za0 za0Var = ab0Var32.T;
                                                                                        if (za0Var != null) {
                                                                                            za0Var.c(tLObject);
                                                                                        }
                                                                                        ab0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    ab0 ab0Var4 = ab0Var3;
                                                                                    ab0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = ab0Var4.U;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.f5.t0(ab0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            ab0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        za0 za0Var2 = ab0Var4.T;
                                                                                        if (za0Var2 != null) {
                                                                                            za0Var2.b(ab0Var4.e, tLObject2);
                                                                                        }
                                                                                        ab0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    ab0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (ab0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = ab0Var.e.request_needed;
                                                xa0Var2 = ab0Var.f;
                                                if (z11 != (xa0Var2 == null && xa0Var2.e.h)) {
                                                }
                                                obj = ab0Var.K.getText().toString();
                                                if (!TextUtils.equals(ab0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j102 = 0;
                                    i122 = ab0Var.a;
                                    if (i122 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            ab0 ab0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ab0Var2.getParentActivity());
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new qa0(ab0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            ab0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            va0Var.addView(this.I);
        }
        y8Var.addView(this.J, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i18 = org.telegram.ui.ActionBar.h6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i18));
        new ei.b4(y8Var, false, new ci.e(17));
        y8Var.addView(this.H, w7.z5.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        this.F.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.F.setCursorVisible(false);
        Y(this.e);
        y8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        va0Var.setClipChildren(false);
        return y8Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.l4 l4Var = this.x;
        int i11 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(l4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.y, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.p7));
        return arrayList;
    }
}
