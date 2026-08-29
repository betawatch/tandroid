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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eb0 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Cells.k4 A;
    public ab0 B;
    public org.telegram.ui.Cells.y8 C;
    public FrameLayout D;
    public org.telegram.ui.Cells.y9 E;
    public org.telegram.ui.Components.un0 F;
    public ab0 G;
    public org.telegram.ui.Cells.y8 H;
    public TextView I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final int[] M;
    public final ArrayList N;
    public final int[] O;
    public db0 P;
    public org.telegram.ui.ActionBar.c2 Q;
    public boolean R;
    public int S;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.lv0 c;
    public org.telegram.ui.Components.lv0 d;
    public TLRPC.TL_chatInviteExported e;
    public bb0 f;
    public org.telegram.ui.Cells.y8 h;
    public org.telegram.ui.Cells.q8 n;
    public cb0 r;
    public TextView s;
    public org.telegram.ui.Cells.y8 v;
    public TextView w;
    public org.telegram.ui.Cells.k4 x;
    public org.telegram.ui.Cells.y8 y;

    public eb0(int i10, long j10) {
        super(null);
        this.J = -3;
        this.L = new ArrayList();
        this.M = new int[]{3600, 86400, 604800};
        this.N = new ArrayList();
        this.O = new int[]{1, 10, 100};
        this.a = i10;
        this.b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.M;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = th.d(iArr[i11], i11, 1, arrayList);
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
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.O;
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
            i12 = th.d(iArr[i12], i12, 1, arrayList);
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
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.O;
            if (i10 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            i10 = th.d(iArr[i10], i10, 1, arrayList);
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
            this.S = ((Integer) this.L.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.S = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            W(i11);
            this.B.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        bb0 bb0Var = this.f;
        if (bb0Var != null) {
            bb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.G.getPaint().getFontMetricsInt(), false);
            this.G.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.q8 q8Var = this.n;
        if (q8Var != null) {
            q8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            bb0 bb0Var2 = this.f;
            if (bb0Var2 != null) {
                bb0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.y8 y8Var = this.h;
            if (y8Var != null) {
                y8Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        cb0 cb0Var = this.r;
        if (cb0Var != null) {
            cb0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.b.setClickable(false);
            this.r.b.setFocusable(false);
            this.r.b.setFocusableInTouchMode(false);
            this.r.b.setLongClickable(false);
        }
    }

    public final void Z(boolean z10) {
        this.A.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.B.setVisibility(z10 ? 0 : 8);
        this.C.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 20));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.f5(1));
        this.I.setEllipsize(TextUtils.TruncateAt.END);
        this.I.setGravity(17);
        final int i11 = 0;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xa0
            public final /* synthetic */ eb0 b;

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
                bb0 bb0Var;
                String obj;
                switch (i11) {
                    case 0:
                        final eb0 eb0Var = this.b;
                        long j11 = eb0Var.b;
                        ArrayList arrayList = eb0Var.N;
                        ArrayList arrayList2 = eb0Var.L;
                        if (!eb0Var.R) {
                            int selectedIndex = eb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(eb0Var.w);
                                Vibrator vibrator = (Vibrator) eb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.q8 q8Var = eb0Var.n;
                                if (q8Var != null && q8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(eb0Var.r.b.getText().toString());
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    i12 = eb0Var.a;
                                    if (i12 != 0) {
                                        org.telegram.ui.ActionBar.c2 c2Var = eb0Var.Q;
                                        if (c2Var != null) {
                                            c2Var.dismiss();
                                        }
                                        eb0Var.R = true;
                                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(eb0Var.getParentActivity(), 3, null);
                                        eb0Var.Q = c2Var2;
                                        c2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = eb0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = eb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = eb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = eb0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        bb0 bb0Var2 = eb0Var.f;
                                        boolean z12 = bb0Var2 != null && bb0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = eb0Var.G.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = eb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        final int i13 = 0;
                                        eb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.va0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final eb0 eb0Var2 = eb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        eb0 eb0Var3 = eb0Var2;
                                                                        eb0Var3.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var3 = eb0Var3.Q;
                                                                        if (c2Var3 != null) {
                                                                            c2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.c5.u0(eb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            db0 db0Var = eb0Var3.P;
                                                                            if (db0Var != null) {
                                                                                db0Var.c(tLObject);
                                                                            }
                                                                            eb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        eb0 eb0Var4 = eb0Var2;
                                                                        eb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var4 = eb0Var4.Q;
                                                                        if (c2Var4 != null) {
                                                                            c2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            db0 db0Var2 = eb0Var4.P;
                                                                            if (db0Var2 != null) {
                                                                                db0Var2.b(eb0Var4.e, tLObject2);
                                                                            }
                                                                            eb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final eb0 eb0Var3 = eb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        eb0 eb0Var32 = eb0Var3;
                                                                        eb0Var32.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var3 = eb0Var32.Q;
                                                                        if (c2Var3 != null) {
                                                                            c2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            db0 db0Var = eb0Var32.P;
                                                                            if (db0Var != null) {
                                                                                db0Var.c(tLObject);
                                                                            }
                                                                            eb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        eb0 eb0Var4 = eb0Var3;
                                                                        eb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var4 = eb0Var4.Q;
                                                                        if (c2Var4 != null) {
                                                                            c2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            db0 db0Var2 = eb0Var4.P;
                                                                            if (db0Var2 != null) {
                                                                                db0Var2.b(eb0Var4.e, tLObject2);
                                                                            }
                                                                            eb0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.c2 c2Var3 = eb0Var.Q;
                                        if (c2Var3 != null) {
                                            c2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = eb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = eb0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = eb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (eb0Var.S != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = eb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (eb0Var.S != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = eb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (eb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = eb0Var.e.request_needed;
                                            bb0Var = eb0Var.f;
                                            if (z11 != (bb0Var == null && bb0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z13 = bb0Var != null && bb0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = eb0Var.G.getText().toString();
                                            if (!TextUtils.equals(eb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                eb0Var.R = true;
                                                org.telegram.ui.ActionBar.c2 c2Var4 = new org.telegram.ui.ActionBar.c2(eb0Var.getParentActivity(), 3, null);
                                                eb0Var.Q = c2Var4;
                                                c2Var4.q(500L);
                                                final int i15 = 1;
                                                eb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.va0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final eb0 eb0Var2 = eb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                eb0 eb0Var32 = eb0Var2;
                                                                                eb0Var32.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var32 = eb0Var32.Q;
                                                                                if (c2Var32 != null) {
                                                                                    c2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    db0 db0Var = eb0Var32.P;
                                                                                    if (db0Var != null) {
                                                                                        db0Var.c(tLObject);
                                                                                    }
                                                                                    eb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                eb0 eb0Var4 = eb0Var2;
                                                                                eb0Var4.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var42 = eb0Var4.Q;
                                                                                if (c2Var42 != null) {
                                                                                    c2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    db0 db0Var2 = eb0Var4.P;
                                                                                    if (db0Var2 != null) {
                                                                                        db0Var2.b(eb0Var4.e, tLObject2);
                                                                                    }
                                                                                    eb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final eb0 eb0Var3 = eb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                eb0 eb0Var32 = eb0Var3;
                                                                                eb0Var32.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var32 = eb0Var32.Q;
                                                                                if (c2Var32 != null) {
                                                                                    c2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    db0 db0Var = eb0Var32.P;
                                                                                    if (db0Var != null) {
                                                                                        db0Var.c(tLObject);
                                                                                    }
                                                                                    eb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                eb0 eb0Var4 = eb0Var3;
                                                                                eb0Var4.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var42 = eb0Var4.Q;
                                                                                if (c2Var42 != null) {
                                                                                    c2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    db0 db0Var2 = eb0Var4.P;
                                                                                    if (db0Var2 != null) {
                                                                                        db0Var2.b(eb0Var4.e, tLObject2);
                                                                                    }
                                                                                    eb0Var4.finishFragment();
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
                                                eb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (eb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = eb0Var.e.request_needed;
                                            bb0Var = eb0Var.f;
                                            if (z11 != (bb0Var == null && bb0Var.e.h)) {
                                            }
                                            obj = eb0Var.G.getText().toString();
                                            if (!TextUtils.equals(eb0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i12 = eb0Var.a;
                                if (i12 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        eb0 eb0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eb0Var2.getParentActivity());
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ua0(eb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        eb0Var2.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        this.I.setSingleLine();
        if (i10 == 0) {
            this.I.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i10 == 1) {
            this.I.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        i7.h6.a(this.I);
        this.actionBar.addView(this.I, i7.f6.d(-2, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        za0 za0Var = new za0(this, context);
        org.telegram.ui.Components.un0 un0Var = new org.telegram.ui.Components.un0(context, za0Var, this.resourceProvider, true);
        this.F = un0Var;
        this.actionBar.setAdaptiveBackground(un0Var);
        ih.j4 j4Var = new ih.j4(this, context, 5);
        this.fragmentView = j4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        int i12 = 2;
        layoutTransition.setInterpolator(2, jrVar);
        layoutTransition.setInterpolator(0, jrVar);
        layoutTransition.setInterpolator(4, jrVar);
        layoutTransition.setInterpolator(1, jrVar);
        int i13 = 3;
        layoutTransition.setInterpolator(3, jrVar);
        za0Var.setLayoutTransition(layoutTransition);
        za0Var.setOrientation(1);
        za0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.F.addView(za0Var);
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        this.x = k4Var;
        k4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        za0Var.addView(this.x);
        org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, null);
        this.d = lv0Var;
        za0Var.addView(lv0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new t70(i12, this, context));
        this.d.setCallback(new ua0(this, i12));
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i14 >= iArr.length) {
                break;
            }
            i14 = th.d(iArr[i14], i14, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        za0Var.addView(this.w, i7.f6.n(-1, 50));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.y = y8Var;
        y8Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        za0Var.addView(this.y);
        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context);
        this.A = k4Var2;
        k4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        za0Var.addView(this.A);
        org.telegram.ui.Components.lv0 lv0Var2 = new org.telegram.ui.Components.lv0(context, null);
        this.c = lv0Var2;
        lv0Var2.setCallback(new ua0(this, i13));
        X();
        za0Var.addView(this.c);
        ab0 ab0Var = new ab0(context, 0);
        this.B = ab0Var;
        ab0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.B.setGravity(16);
        this.B.setTextSize(1, 16.0f);
        this.B.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.B.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.B.setInputType(2);
        this.B.addTextChangedListener(new ya0(this, 1));
        za0Var.addView(this.B, i7.f6.n(-1, 50));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.C = y8Var2;
        y8Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        za0Var.addView(this.C);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        bb0 bb0Var = new bb0(context);
        this.f = bb0Var;
        int i15 = org.telegram.ui.ActionBar.g6.d6;
        bb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f.setTag(Integer.valueOf(i15));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new lh.z1(7, this, z10));
        za0Var.addView(this.f, i7.f6.n(-1, 56));
        org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.h = y8Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            y8Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        za0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
                this.n = q8Var;
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new t70(3, this, new Runnable[1]));
                za0Var.addView(this.n, i7.f6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                cb0 cb0Var = new cb0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = cb0Var;
                cb0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i15));
                cb0 cb0Var2 = this.r;
                cb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(cb0Var2, 4);
                org.telegram.ui.Cells.e3 e3Var = cb0Var2.b;
                e3Var.setImeOptions(6);
                e3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.r.addView(this.s, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                cb0 cb0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                cb0Var3.getClass();
                ImageView imageView = new ImageView(cb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                cb0Var3.addView(imageView, i7.f6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.e3 e3Var2 = cb0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                e3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                za0Var.addView(this.r, i7.f6.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
                this.v = y8Var4;
                if (this.e != null) {
                    y8Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    y8Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new ta0(this, 2)));
                }
                za0Var.addView(this.v, i7.f6.n(-1, -2));
            }
        }
        ab0 ab0Var2 = new ab0(context, 1);
        this.G = ab0Var2;
        ab0Var2.addTextChangedListener(new ya0(this, 0));
        this.G.setCursorVisible(false);
        this.G.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.G.setGravity(16);
        this.G.setHint(LocaleController.getString(R.string.LinkNameHint));
        ab0 ab0Var3 = this.G;
        int i16 = org.telegram.ui.ActionBar.g6.y6;
        ab0Var3.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.G.setLines(1);
        this.G.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.G.setSingleLine();
        ab0 ab0Var4 = this.G;
        int i17 = org.telegram.ui.ActionBar.g6.G6;
        ab0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.G.setTextSize(1, 16.0f);
        za0Var.addView(this.G, i7.f6.n(-1, 50));
        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        this.H = y8Var5;
        y8Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        za0Var.addView(this.H);
        if (i10 == 1) {
            org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
            this.E = y9Var;
            y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.E.b(LocaleController.getString(R.string.RevokeLink), false);
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
            final int i18 = 1;
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xa0
                public final /* synthetic */ eb0 b;

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
                    bb0 bb0Var2;
                    String obj;
                    switch (i18) {
                        case 0:
                            final eb0 eb0Var = this.b;
                            long j11 = eb0Var.b;
                            ArrayList arrayList2 = eb0Var.N;
                            ArrayList arrayList22 = eb0Var.L;
                            if (!eb0Var.R) {
                                int selectedIndex = eb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(eb0Var.w);
                                    Vibrator vibrator = (Vibrator) eb0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.q8 q8Var2 = eb0Var.n;
                                    if (q8Var2 != null && q8Var2.e.h) {
                                        try {
                                            j102 = Long.parseLong(eb0Var.r.b.getText().toString());
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        i122 = eb0Var.a;
                                        if (i122 != 0) {
                                            org.telegram.ui.ActionBar.c2 c2Var = eb0Var.Q;
                                            if (c2Var != null) {
                                                c2Var.dismiss();
                                            }
                                            eb0Var.R = true;
                                            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(eb0Var.getParentActivity(), 3, null);
                                            eb0Var.Q = c2Var2;
                                            c2Var2.q(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = eb0Var.getMessagesController().getInputPeer(-j11);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = eb0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = eb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = eb0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            bb0 bb0Var22 = eb0Var.f;
                                            boolean z12 = bb0Var22 != null && bb0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = eb0Var.G.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j102 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = eb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j102;
                                            }
                                            final int i132 = 0;
                                            eb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.va0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i132) {
                                                        case 0:
                                                            final int i142 = 0;
                                                            final eb0 eb0Var2 = eb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i142) {
                                                                        case 0:
                                                                            eb0 eb0Var32 = eb0Var2;
                                                                            eb0Var32.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var32 = eb0Var32.Q;
                                                                            if (c2Var32 != null) {
                                                                                c2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                db0 db0Var = eb0Var32.P;
                                                                                if (db0Var != null) {
                                                                                    db0Var.c(tLObject);
                                                                                }
                                                                                eb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            eb0 eb0Var4 = eb0Var2;
                                                                            eb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var42 = eb0Var4.Q;
                                                                            if (c2Var42 != null) {
                                                                                c2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                db0 db0Var2 = eb0Var4.P;
                                                                                if (db0Var2 != null) {
                                                                                    db0Var2.b(eb0Var4.e, tLObject2);
                                                                                }
                                                                                eb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i152 = 1;
                                                            final eb0 eb0Var3 = eb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            eb0 eb0Var32 = eb0Var3;
                                                                            eb0Var32.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var32 = eb0Var32.Q;
                                                                            if (c2Var32 != null) {
                                                                                c2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                db0 db0Var = eb0Var32.P;
                                                                                if (db0Var != null) {
                                                                                    db0Var.c(tLObject);
                                                                                }
                                                                                eb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            eb0 eb0Var4 = eb0Var3;
                                                                            eb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var42 = eb0Var4.Q;
                                                                            if (c2Var42 != null) {
                                                                                c2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                db0 db0Var2 = eb0Var4.P;
                                                                                if (db0Var2 != null) {
                                                                                    db0Var2.b(eb0Var4.e, tLObject2);
                                                                                }
                                                                                eb0Var4.finishFragment();
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
                                            org.telegram.ui.ActionBar.c2 c2Var3 = eb0Var.Q;
                                            if (c2Var3 != null) {
                                                c2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = eb0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = eb0Var.getMessagesController().getInputPeer(-j11);
                                            int selectedIndex4 = eb0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (eb0Var.S != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = eb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (eb0Var.S != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = eb0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (eb0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = eb0Var.e.request_needed;
                                                bb0Var2 = eb0Var.f;
                                                if (z11 != (bb0Var2 == null && bb0Var2.e.h)) {
                                                    int i142 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i142 | 8;
                                                    boolean z13 = bb0Var2 != null && bb0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i142 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = eb0Var.G.getText().toString();
                                                if (!TextUtils.equals(eb0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    eb0Var.R = true;
                                                    org.telegram.ui.ActionBar.c2 c2Var4 = new org.telegram.ui.ActionBar.c2(eb0Var.getParentActivity(), 3, null);
                                                    eb0Var.Q = c2Var4;
                                                    c2Var4.q(500L);
                                                    final int i152 = 1;
                                                    eb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.va0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i152) {
                                                                case 0:
                                                                    final int i1422 = 0;
                                                                    final eb0 eb0Var2 = eb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1422) {
                                                                                case 0:
                                                                                    eb0 eb0Var32 = eb0Var2;
                                                                                    eb0Var32.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var32 = eb0Var32.Q;
                                                                                    if (c2Var32 != null) {
                                                                                        c2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        db0 db0Var = eb0Var32.P;
                                                                                        if (db0Var != null) {
                                                                                            db0Var.c(tLObject);
                                                                                        }
                                                                                        eb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    eb0 eb0Var4 = eb0Var2;
                                                                                    eb0Var4.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var42 = eb0Var4.Q;
                                                                                    if (c2Var42 != null) {
                                                                                        c2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        db0 db0Var2 = eb0Var4.P;
                                                                                        if (db0Var2 != null) {
                                                                                            db0Var2.b(eb0Var4.e, tLObject2);
                                                                                        }
                                                                                        eb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1522 = 1;
                                                                    final eb0 eb0Var3 = eb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wa0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    eb0 eb0Var32 = eb0Var3;
                                                                                    eb0Var32.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var32 = eb0Var32.Q;
                                                                                    if (c2Var32 != null) {
                                                                                        c2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.c5.u0(eb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        db0 db0Var = eb0Var32.P;
                                                                                        if (db0Var != null) {
                                                                                            db0Var.c(tLObject);
                                                                                        }
                                                                                        eb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    eb0 eb0Var4 = eb0Var3;
                                                                                    eb0Var4.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var42 = eb0Var4.Q;
                                                                                    if (c2Var42 != null) {
                                                                                        c2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.c5.u0(eb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            eb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        db0 db0Var2 = eb0Var4.P;
                                                                                        if (db0Var2 != null) {
                                                                                            db0Var2.b(eb0Var4.e, tLObject2);
                                                                                        }
                                                                                        eb0Var4.finishFragment();
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
                                                    eb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (eb0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = eb0Var.e.request_needed;
                                                bb0Var2 = eb0Var.f;
                                                if (z11 != (bb0Var2 == null && bb0Var2.e.h)) {
                                                }
                                                obj = eb0Var.G.getText().toString();
                                                if (!TextUtils.equals(eb0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j102 = 0;
                                    i122 = eb0Var.a;
                                    if (i122 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            eb0 eb0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eb0Var2.getParentActivity());
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ua0(eb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            eb0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            za0Var.addView(this.E);
        }
        j4Var.addView(this.F, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        int i19 = org.telegram.ui.ActionBar.g6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i19));
        new nh.w3(j4Var, false, new eg.h(5));
        j4Var.addView(this.D, i7.f6.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.A.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.G.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.B.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.B.setCursorVisible(false);
        Y(this.e);
        j4Var.setClipChildren(false);
        this.F.setClipChildren(false);
        za0Var.setClipChildren(false);
        return j4Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        this.F.getLayoutParams().height = this.F.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.k4 k4Var = this.x;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(k4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.p7));
        return arrayList;
    }
}
