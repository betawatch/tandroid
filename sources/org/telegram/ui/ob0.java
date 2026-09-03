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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ob0 extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Cells.m4 B;
    public kb0 C;
    public org.telegram.ui.Cells.a9 D;
    public FrameLayout E;
    public org.telegram.ui.Cells.aa F;
    public org.telegram.ui.Components.eo0 G;
    public kb0 H;
    public org.telegram.ui.Cells.a9 I;
    public TextView J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public final int[] N;
    public final ArrayList O;
    public final int[] P;
    public nb0 Q;
    public org.telegram.ui.ActionBar.d2 R;
    public boolean S;
    public int T;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.uv0 c;
    public org.telegram.ui.Components.uv0 d;
    public TLRPC.TL_chatInviteExported e;
    public lb0 f;
    public org.telegram.ui.Cells.a9 h;
    public org.telegram.ui.Cells.s8 n;
    public mb0 r;
    public TextView s;
    public org.telegram.ui.Cells.a9 v;
    public TextView w;
    public org.telegram.ui.Cells.m4 x;
    public org.telegram.ui.Cells.a9 y;

    public ob0(int i10, long j10) {
        super(null);
        this.K = -3;
        this.M = new ArrayList();
        this.N = new int[]{3600, 86400, 604800};
        this.O = new ArrayList();
        this.P = new int[]{1, 10, 100};
        this.a = i10;
        this.b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        while (true) {
            iArr = this.N;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z4 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z4 = true;
            }
            i11 = yh.d(iArr[i11], i11, 1, arrayList);
        }
        if (!z4) {
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
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(j10 * 1000);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(j10 * 1000);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i12 = 0;
        boolean z4 = false;
        int i13 = 0;
        while (true) {
            iArr = this.P;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z4 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z4 = true;
            }
            i12 = yh.d(iArr[i12], i12, 1, arrayList);
        }
        if (!z4) {
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
        ArrayList arrayList = this.O;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.P;
            if (i10 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            i10 = yh.d(iArr[i10], i10, 1, arrayList);
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
            this.T = ((Integer) this.M.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.T = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            W(i11);
            this.C.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        lb0 lb0Var = this.f;
        if (lb0Var != null) {
            lb0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.H.getPaint().getFontMetricsInt(), false);
            this.H.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.s8 s8Var = this.n;
        if (s8Var != null) {
            s8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            lb0 lb0Var2 = this.f;
            if (lb0Var2 != null) {
                lb0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.a9 a9Var = this.h;
            if (a9Var != null) {
                a9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        mb0 mb0Var = this.r;
        if (mb0Var != null) {
            mb0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.b.setClickable(false);
            this.r.b.setFocusable(false);
            this.r.b.setFocusableInTouchMode(false);
            this.r.b.setLongClickable(false);
        }
    }

    public final void Z(boolean z4) {
        this.B.setVisibility(z4 ? 0 : 8);
        this.c.setVisibility(z4 ? 0 : 8);
        this.C.setVisibility(z4 ? 0 : 8);
        this.D.setVisibility(z4 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 20));
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.j5(1));
        this.J.setEllipsize(TextUtils.TruncateAt.END);
        this.J.setGravity(17);
        final int i11 = 0;
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
            public final /* synthetic */ ob0 b;

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
                boolean z4;
                boolean z10;
                lb0 lb0Var;
                String obj;
                switch (i11) {
                    case 0:
                        final ob0 ob0Var = this.b;
                        long j11 = ob0Var.b;
                        ArrayList arrayList = ob0Var.O;
                        ArrayList arrayList2 = ob0Var.M;
                        if (!ob0Var.S) {
                            int selectedIndex = ob0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(ob0Var.w);
                                Vibrator vibrator = (Vibrator) ob0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.s8 s8Var = ob0Var.n;
                                if (s8Var != null && s8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(ob0Var.r.b.getText().toString());
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    i12 = ob0Var.a;
                                    if (i12 != 0) {
                                        org.telegram.ui.ActionBar.d2 d2Var = ob0Var.R;
                                        if (d2Var != null) {
                                            d2Var.dismiss();
                                        }
                                        ob0Var.S = true;
                                        org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(ob0Var.getParentActivity(), 3, null);
                                        ob0Var.R = d2Var2;
                                        d2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = ob0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = ob0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = ob0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = ob0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        lb0 lb0Var2 = ob0Var.f;
                                        boolean z11 = lb0Var2 != null && lb0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z11;
                                        if (z11) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = ob0Var.H.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = ob0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        final int i13 = 0;
                                        ob0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.eb0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final ob0 ob0Var2 = ob0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        ob0 ob0Var3 = ob0Var2;
                                                                        ob0Var3.S = false;
                                                                        org.telegram.ui.ActionBar.d2 d2Var3 = ob0Var3.R;
                                                                        if (d2Var3 != null) {
                                                                            d2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.z4.u0(ob0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            nb0 nb0Var = ob0Var3.Q;
                                                                            if (nb0Var != null) {
                                                                                nb0Var.c(tLObject);
                                                                            }
                                                                            ob0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        ob0 ob0Var4 = ob0Var2;
                                                                        ob0Var4.S = false;
                                                                        org.telegram.ui.ActionBar.d2 d2Var4 = ob0Var4.R;
                                                                        if (d2Var4 != null) {
                                                                            d2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            nb0 nb0Var2 = ob0Var4.Q;
                                                                            if (nb0Var2 != null) {
                                                                                nb0Var2.b(ob0Var4.e, tLObject2);
                                                                            }
                                                                            ob0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final ob0 ob0Var3 = ob0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        ob0 ob0Var32 = ob0Var3;
                                                                        ob0Var32.S = false;
                                                                        org.telegram.ui.ActionBar.d2 d2Var3 = ob0Var32.R;
                                                                        if (d2Var3 != null) {
                                                                            d2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            nb0 nb0Var = ob0Var32.Q;
                                                                            if (nb0Var != null) {
                                                                                nb0Var.c(tLObject);
                                                                            }
                                                                            ob0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        ob0 ob0Var4 = ob0Var3;
                                                                        ob0Var4.S = false;
                                                                        org.telegram.ui.ActionBar.d2 d2Var4 = ob0Var4.R;
                                                                        if (d2Var4 != null) {
                                                                            d2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            nb0 nb0Var2 = ob0Var4.Q;
                                                                            if (nb0Var2 != null) {
                                                                                nb0Var2.b(ob0Var4.e, tLObject2);
                                                                            }
                                                                            ob0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.d2 d2Var3 = ob0Var.R;
                                        if (d2Var3 != null) {
                                            d2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = ob0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = ob0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = ob0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (ob0Var.T != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = ob0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z4 = true;
                                            }
                                            z4 = false;
                                        } else {
                                            if (ob0Var.T != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z4 = true;
                                            }
                                            z4 = false;
                                        }
                                        int selectedIndex5 = ob0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (ob0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z4 = true;
                                            }
                                            z10 = ob0Var.e.request_needed;
                                            lb0Var = ob0Var.f;
                                            if (z10 != (lb0Var == null && lb0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z12 = lb0Var != null && lb0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z12;
                                                if (z12) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z4 = true;
                                            }
                                            obj = ob0Var.H.getText().toString();
                                            if (!TextUtils.equals(ob0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                ob0Var.S = true;
                                                org.telegram.ui.ActionBar.d2 d2Var4 = new org.telegram.ui.ActionBar.d2(ob0Var.getParentActivity(), 3, null);
                                                ob0Var.R = d2Var4;
                                                d2Var4.q(500L);
                                                final int i15 = 1;
                                                ob0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.eb0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final ob0 ob0Var2 = ob0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                ob0 ob0Var32 = ob0Var2;
                                                                                ob0Var32.S = false;
                                                                                org.telegram.ui.ActionBar.d2 d2Var32 = ob0Var32.R;
                                                                                if (d2Var32 != null) {
                                                                                    d2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    nb0 nb0Var = ob0Var32.Q;
                                                                                    if (nb0Var != null) {
                                                                                        nb0Var.c(tLObject);
                                                                                    }
                                                                                    ob0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                ob0 ob0Var4 = ob0Var2;
                                                                                ob0Var4.S = false;
                                                                                org.telegram.ui.ActionBar.d2 d2Var42 = ob0Var4.R;
                                                                                if (d2Var42 != null) {
                                                                                    d2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    nb0 nb0Var2 = ob0Var4.Q;
                                                                                    if (nb0Var2 != null) {
                                                                                        nb0Var2.b(ob0Var4.e, tLObject2);
                                                                                    }
                                                                                    ob0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final ob0 ob0Var3 = ob0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                ob0 ob0Var32 = ob0Var3;
                                                                                ob0Var32.S = false;
                                                                                org.telegram.ui.ActionBar.d2 d2Var32 = ob0Var32.R;
                                                                                if (d2Var32 != null) {
                                                                                    d2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    nb0 nb0Var = ob0Var32.Q;
                                                                                    if (nb0Var != null) {
                                                                                        nb0Var.c(tLObject);
                                                                                    }
                                                                                    ob0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                ob0 ob0Var4 = ob0Var3;
                                                                                ob0Var4.S = false;
                                                                                org.telegram.ui.ActionBar.d2 d2Var42 = ob0Var4.R;
                                                                                if (d2Var42 != null) {
                                                                                    d2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    nb0 nb0Var2 = ob0Var4.Q;
                                                                                    if (nb0Var2 != null) {
                                                                                        nb0Var2.b(ob0Var4.e, tLObject2);
                                                                                    }
                                                                                    ob0Var4.finishFragment();
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
                                                ob0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (ob0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z4 = true;
                                            }
                                            z10 = ob0Var.e.request_needed;
                                            lb0Var = ob0Var.f;
                                            if (z10 != (lb0Var == null && lb0Var.e.h)) {
                                            }
                                            obj = ob0Var.H.getText().toString();
                                            if (!TextUtils.equals(ob0Var.e.title, obj)) {
                                            }
                                            if (!z4) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i12 = ob0Var.a;
                                if (i12 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        ob0 ob0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ob0Var2.getParentActivity());
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new db0(ob0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        ob0Var2.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        this.J.setSingleLine();
        if (i10 == 0) {
            this.J.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i10 == 1) {
            this.J.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.J.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        this.J.setTextSize(1, 14.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        k7.e6.a(this.J);
        this.actionBar.addView(this.J, k7.c6.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        jb0 jb0Var = new jb0(this, context);
        org.telegram.ui.Components.eo0 eo0Var = new org.telegram.ui.Components.eo0(context, jb0Var, this.resourceProvider, true);
        this.G = eo0Var;
        this.actionBar.setAdaptiveBackground(eo0Var);
        lh.j4 j4Var = new lh.j4(this, context, 5);
        this.fragmentView = j4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        layoutTransition.setInterpolator(2, prVar);
        layoutTransition.setInterpolator(0, prVar);
        layoutTransition.setInterpolator(4, prVar);
        layoutTransition.setInterpolator(1, prVar);
        int i12 = 3;
        layoutTransition.setInterpolator(3, prVar);
        jb0Var.setLayoutTransition(layoutTransition);
        jb0Var.setOrientation(1);
        jb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.G.addView(jb0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        jb0Var.addView(this.x);
        org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
        this.d = uv0Var;
        jb0Var.addView(uv0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new org.telegram.ui.Components.rx0(29, this, context));
        this.d.setCallback(new db0(this, 2));
        ArrayList arrayList = this.M;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = yh.d(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        jb0Var.addView(this.w, k7.c6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.y = a9Var;
        a9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        jb0Var.addView(this.y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.B = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        jb0Var.addView(this.B);
        org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
        this.c = uv0Var2;
        uv0Var2.setCallback(new db0(this, i12));
        X();
        jb0Var.addView(this.c);
        kb0 kb0Var = new kb0(context, 0);
        this.C = kb0Var;
        kb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.C.setGravity(16);
        this.C.setTextSize(1, 16.0f);
        this.C.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.C.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.C.setInputType(2);
        this.C.addTextChangedListener(new ib0(this, 1));
        jb0Var.addView(this.C, k7.c6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.D = a9Var2;
        a9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        jb0Var.addView(this.D);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z4 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        lb0 lb0Var = new lb0(context);
        this.f = lb0Var;
        int i14 = org.telegram.ui.ActionBar.k6.d6;
        lb0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.f.setTag(Integer.valueOf(i14));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new oh.b2(7, this, z4));
        jb0Var.addView(this.f, k7.c6.n(-1, 56));
        org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.h = a9Var3;
        if (z4) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            a9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        jb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
                this.n = s8Var;
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new hb0(i11, this, new Runnable[1]));
                jb0Var.addView(this.n, k7.c6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A6, false));
                mb0 mb0Var = new mb0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = mb0Var;
                mb0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i14));
                mb0 mb0Var2 = this.r;
                mb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(mb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = mb0Var2.b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.t2(gVar, 2));
                this.r.addView(this.s, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                mb0 mb0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                mb0Var3.getClass();
                ImageView imageView = new ImageView(mb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                mb0Var3.addView(imageView, k7.c6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = mb0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                jb0Var.addView(this.r, k7.c6.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
                this.v = a9Var4;
                if (this.e != null) {
                    a9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    a9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new cb0(this, 2)));
                }
                jb0Var.addView(this.v, k7.c6.n(-1, -2));
            }
        }
        kb0 kb0Var2 = new kb0(context, 1);
        this.H = kb0Var2;
        kb0Var2.addTextChangedListener(new ib0(this, 0));
        this.H.setCursorVisible(false);
        this.H.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.H.setGravity(16);
        this.H.setHint(LocaleController.getString(R.string.LinkNameHint));
        kb0 kb0Var3 = this.H;
        int i15 = org.telegram.ui.ActionBar.k6.y6;
        kb0Var3.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.H.setLines(1);
        this.H.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.H.setSingleLine();
        kb0 kb0Var4 = this.H;
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        kb0Var4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        this.H.setTextSize(1, 16.0f);
        jb0Var.addView(this.H, k7.c6.n(-1, 50));
        org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.I = a9Var5;
        a9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        jb0Var.addView(this.I);
        if (i10 == 1) {
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.F = aaVar;
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            this.F.b(LocaleController.getString(R.string.RevokeLink), false);
            this.F.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
            final int i17 = 1;
            this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
                public final /* synthetic */ ob0 b;

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
                    boolean z42;
                    boolean z10;
                    lb0 lb0Var2;
                    String obj;
                    switch (i17) {
                        case 0:
                            final ob0 ob0Var = this.b;
                            long j11 = ob0Var.b;
                            ArrayList arrayList2 = ob0Var.O;
                            ArrayList arrayList22 = ob0Var.M;
                            if (!ob0Var.S) {
                                int selectedIndex = ob0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(ob0Var.w);
                                    Vibrator vibrator = (Vibrator) ob0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.s8 s8Var2 = ob0Var.n;
                                    if (s8Var2 != null && s8Var2.e.h) {
                                        try {
                                            j102 = Long.parseLong(ob0Var.r.b.getText().toString());
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        i122 = ob0Var.a;
                                        if (i122 != 0) {
                                            org.telegram.ui.ActionBar.d2 d2Var = ob0Var.R;
                                            if (d2Var != null) {
                                                d2Var.dismiss();
                                            }
                                            ob0Var.S = true;
                                            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(ob0Var.getParentActivity(), 3, null);
                                            ob0Var.R = d2Var2;
                                            d2Var2.q(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = ob0Var.getMessagesController().getInputPeer(-j11);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = ob0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = ob0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = ob0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            lb0 lb0Var22 = ob0Var.f;
                                            boolean z11 = lb0Var22 != null && lb0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z11;
                                            if (z11) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = ob0Var.H.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j102 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = ob0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j102;
                                            }
                                            final int i132 = 0;
                                            ob0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.eb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i132) {
                                                        case 0:
                                                            final int i142 = 0;
                                                            final ob0 ob0Var2 = ob0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i142) {
                                                                        case 0:
                                                                            ob0 ob0Var32 = ob0Var2;
                                                                            ob0Var32.S = false;
                                                                            org.telegram.ui.ActionBar.d2 d2Var32 = ob0Var32.R;
                                                                            if (d2Var32 != null) {
                                                                                d2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                nb0 nb0Var = ob0Var32.Q;
                                                                                if (nb0Var != null) {
                                                                                    nb0Var.c(tLObject);
                                                                                }
                                                                                ob0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            ob0 ob0Var4 = ob0Var2;
                                                                            ob0Var4.S = false;
                                                                            org.telegram.ui.ActionBar.d2 d2Var42 = ob0Var4.R;
                                                                            if (d2Var42 != null) {
                                                                                d2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                nb0 nb0Var2 = ob0Var4.Q;
                                                                                if (nb0Var2 != null) {
                                                                                    nb0Var2.b(ob0Var4.e, tLObject2);
                                                                                }
                                                                                ob0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i152 = 1;
                                                            final ob0 ob0Var3 = ob0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            ob0 ob0Var32 = ob0Var3;
                                                                            ob0Var32.S = false;
                                                                            org.telegram.ui.ActionBar.d2 d2Var32 = ob0Var32.R;
                                                                            if (d2Var32 != null) {
                                                                                d2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                nb0 nb0Var = ob0Var32.Q;
                                                                                if (nb0Var != null) {
                                                                                    nb0Var.c(tLObject);
                                                                                }
                                                                                ob0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            ob0 ob0Var4 = ob0Var3;
                                                                            ob0Var4.S = false;
                                                                            org.telegram.ui.ActionBar.d2 d2Var42 = ob0Var4.R;
                                                                            if (d2Var42 != null) {
                                                                                d2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                nb0 nb0Var2 = ob0Var4.Q;
                                                                                if (nb0Var2 != null) {
                                                                                    nb0Var2.b(ob0Var4.e, tLObject2);
                                                                                }
                                                                                ob0Var4.finishFragment();
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
                                            org.telegram.ui.ActionBar.d2 d2Var3 = ob0Var.R;
                                            if (d2Var3 != null) {
                                                d2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = ob0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = ob0Var.getMessagesController().getInputPeer(-j11);
                                            int selectedIndex4 = ob0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (ob0Var.T != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = ob0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z42 = true;
                                                }
                                                z42 = false;
                                            } else {
                                                if (ob0Var.T != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z42 = true;
                                                }
                                                z42 = false;
                                            }
                                            int selectedIndex5 = ob0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (ob0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z42 = true;
                                                }
                                                z10 = ob0Var.e.request_needed;
                                                lb0Var2 = ob0Var.f;
                                                if (z10 != (lb0Var2 == null && lb0Var2.e.h)) {
                                                    int i142 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i142 | 8;
                                                    boolean z12 = lb0Var2 != null && lb0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z12;
                                                    if (z12) {
                                                        tL_messages_editExportedChatInvite.flags = i142 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z42 = true;
                                                }
                                                obj = ob0Var.H.getText().toString();
                                                if (!TextUtils.equals(ob0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z42 = true;
                                                }
                                                if (!z42) {
                                                    ob0Var.S = true;
                                                    org.telegram.ui.ActionBar.d2 d2Var4 = new org.telegram.ui.ActionBar.d2(ob0Var.getParentActivity(), 3, null);
                                                    ob0Var.R = d2Var4;
                                                    d2Var4.q(500L);
                                                    final int i152 = 1;
                                                    ob0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.eb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i152) {
                                                                case 0:
                                                                    final int i1422 = 0;
                                                                    final ob0 ob0Var2 = ob0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1422) {
                                                                                case 0:
                                                                                    ob0 ob0Var32 = ob0Var2;
                                                                                    ob0Var32.S = false;
                                                                                    org.telegram.ui.ActionBar.d2 d2Var32 = ob0Var32.R;
                                                                                    if (d2Var32 != null) {
                                                                                        d2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        nb0 nb0Var = ob0Var32.Q;
                                                                                        if (nb0Var != null) {
                                                                                            nb0Var.c(tLObject);
                                                                                        }
                                                                                        ob0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    ob0 ob0Var4 = ob0Var2;
                                                                                    ob0Var4.S = false;
                                                                                    org.telegram.ui.ActionBar.d2 d2Var42 = ob0Var4.R;
                                                                                    if (d2Var42 != null) {
                                                                                        d2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        nb0 nb0Var2 = ob0Var4.Q;
                                                                                        if (nb0Var2 != null) {
                                                                                            nb0Var2.b(ob0Var4.e, tLObject2);
                                                                                        }
                                                                                        ob0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1522 = 1;
                                                                    final ob0 ob0Var3 = ob0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    ob0 ob0Var32 = ob0Var3;
                                                                                    ob0Var32.S = false;
                                                                                    org.telegram.ui.ActionBar.d2 d2Var32 = ob0Var32.R;
                                                                                    if (d2Var32 != null) {
                                                                                        d2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.z4.u0(ob0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        nb0 nb0Var = ob0Var32.Q;
                                                                                        if (nb0Var != null) {
                                                                                            nb0Var.c(tLObject);
                                                                                        }
                                                                                        ob0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    ob0 ob0Var4 = ob0Var3;
                                                                                    ob0Var4.S = false;
                                                                                    org.telegram.ui.ActionBar.d2 d2Var42 = ob0Var4.R;
                                                                                    if (d2Var42 != null) {
                                                                                        d2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.z4.u0(ob0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            ob0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        nb0 nb0Var2 = ob0Var4.Q;
                                                                                        if (nb0Var2 != null) {
                                                                                            nb0Var2.b(ob0Var4.e, tLObject2);
                                                                                        }
                                                                                        ob0Var4.finishFragment();
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
                                                    ob0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (ob0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z42 = true;
                                                }
                                                z10 = ob0Var.e.request_needed;
                                                lb0Var2 = ob0Var.f;
                                                if (z10 != (lb0Var2 == null && lb0Var2.e.h)) {
                                                }
                                                obj = ob0Var.H.getText().toString();
                                                if (!TextUtils.equals(ob0Var.e.title, obj)) {
                                                }
                                                if (!z42) {
                                                }
                                            }
                                        }
                                    }
                                    j102 = 0;
                                    i122 = ob0Var.a;
                                    if (i122 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            ob0 ob0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ob0Var2.getParentActivity());
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new db0(ob0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            ob0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            jb0Var.addView(this.F);
        }
        j4Var.addView(this.G, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        int i18 = org.telegram.ui.ActionBar.k6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i18));
        new qh.h3(j4Var, false, new hg.h(5));
        j4Var.addView(this.E, k7.c6.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.C.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        this.C.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.C.setCursorVisible(false);
        Y(this.e);
        j4Var.setClipChildren(false);
        this.G.setClipChildren(false);
        jb0Var.setClipChildren(false);
        return j4Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        this.G.getLayoutParams().height = this.G.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.m4 m4Var = this.x;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(m4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.p7));
        return arrayList;
    }
}
