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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.j4 A;
    public bb0 B;
    public org.telegram.ui.Cells.x8 C;
    public FrameLayout D;
    public org.telegram.ui.Cells.x9 E;
    public org.telegram.ui.Components.kn0 F;
    public bb0 G;
    public org.telegram.ui.Cells.x8 H;
    public TextView I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final int[] M;
    public final ArrayList N;
    public final int[] O;
    public eb0 P;
    public org.telegram.ui.ActionBar.b2 Q;
    public boolean R;
    public int S;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.dv0 c;
    public org.telegram.ui.Components.dv0 d;
    public TLRPC.TL_chatInviteExported e;
    public cb0 f;
    public org.telegram.ui.Cells.x8 h;
    public org.telegram.ui.Cells.p8 n;
    public db0 r;
    public TextView s;
    public org.telegram.ui.Cells.x8 v;
    public TextView w;
    public org.telegram.ui.Cells.j4 x;
    public org.telegram.ui.Cells.x8 y;

    public fb0(int i10, long j10) {
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
            i11 = i0.a.f(iArr[i11], i11, 1, arrayList);
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
            i12 = i0.a.f(iArr[i12], i12, 1, arrayList);
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
            i10 = i0.a.f(iArr[i10], i10, 1, arrayList);
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
        cb0 cb0Var = this.f;
        if (cb0Var != null) {
            cb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.G.getPaint().getFontMetricsInt(), false);
            this.G.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.p8 p8Var = this.n;
        if (p8Var != null) {
            p8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            cb0 cb0Var2 = this.f;
            if (cb0Var2 != null) {
                cb0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.x8 x8Var = this.h;
            if (x8Var != null) {
                x8Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        db0 db0Var = this.r;
        if (db0Var != null) {
            db0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
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
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 29));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.f5(1));
        this.I.setEllipsize(TextUtils.TruncateAt.END);
        this.I.setGravity(17);
        final int i11 = 0;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ya0
            public final /* synthetic */ fb0 b;

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
                cb0 cb0Var;
                String obj;
                switch (i11) {
                    case 0:
                        final fb0 fb0Var = this.b;
                        long j11 = fb0Var.b;
                        ArrayList arrayList = fb0Var.N;
                        ArrayList arrayList2 = fb0Var.L;
                        if (!fb0Var.R) {
                            int selectedIndex = fb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(fb0Var.w);
                                Vibrator vibrator = (Vibrator) fb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.p8 p8Var = fb0Var.n;
                                if (p8Var != null && p8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(fb0Var.r.b.getText().toString());
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    i12 = fb0Var.a;
                                    if (i12 != 0) {
                                        org.telegram.ui.ActionBar.b2 b2Var = fb0Var.Q;
                                        if (b2Var != null) {
                                            b2Var.dismiss();
                                        }
                                        fb0Var.R = true;
                                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                        fb0Var.Q = b2Var2;
                                        b2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = fb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = fb0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        cb0 cb0Var2 = fb0Var.f;
                                        boolean z12 = cb0Var2 != null && cb0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = fb0Var.G.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = fb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        final int i13 = 0;
                                        fb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.wa0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final fb0 fb0Var2 = fb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        fb0 fb0Var3 = fb0Var2;
                                                                        fb0Var3.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var3.Q;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var3.P;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        fb0 fb0Var4 = fb0Var2;
                                                                        fb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = fb0Var4.Q;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var4.P;
                                                                            if (eb0Var2 != null) {
                                                                                eb0Var2.b(fb0Var4.e, tLObject2);
                                                                            }
                                                                            fb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final fb0 fb0Var3 = fb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        fb0 fb0Var32 = fb0Var3;
                                                                        fb0Var32.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var32.Q;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var32.P;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        fb0 fb0Var4 = fb0Var3;
                                                                        fb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = fb0Var4.Q;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var4.P;
                                                                            if (eb0Var2 != null) {
                                                                                eb0Var2.b(fb0Var4.e, tLObject2);
                                                                            }
                                                                            fb0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var.Q;
                                        if (b2Var3 != null) {
                                            b2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = fb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = fb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (fb0Var.S != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (fb0Var.S != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = fb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (fb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = fb0Var.e.request_needed;
                                            cb0Var = fb0Var.f;
                                            if (z11 != (cb0Var == null && cb0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z13 = cb0Var != null && cb0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = fb0Var.G.getText().toString();
                                            if (!TextUtils.equals(fb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                fb0Var.R = true;
                                                org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                                fb0Var.Q = b2Var4;
                                                b2Var4.q(500L);
                                                final int i15 = 1;
                                                fb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.wa0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final fb0 fb0Var2 = fb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                fb0 fb0Var32 = fb0Var2;
                                                                                fb0Var32.R = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = fb0Var32.Q;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    eb0 eb0Var = fb0Var32.P;
                                                                                    if (eb0Var != null) {
                                                                                        eb0Var.c(tLObject);
                                                                                    }
                                                                                    fb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                fb0 fb0Var4 = fb0Var2;
                                                                                fb0Var4.R = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = fb0Var4.Q;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    eb0 eb0Var2 = fb0Var4.P;
                                                                                    if (eb0Var2 != null) {
                                                                                        eb0Var2.b(fb0Var4.e, tLObject2);
                                                                                    }
                                                                                    fb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final fb0 fb0Var3 = fb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                fb0 fb0Var32 = fb0Var3;
                                                                                fb0Var32.R = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = fb0Var32.Q;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    eb0 eb0Var = fb0Var32.P;
                                                                                    if (eb0Var != null) {
                                                                                        eb0Var.c(tLObject);
                                                                                    }
                                                                                    fb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                fb0 fb0Var4 = fb0Var3;
                                                                                fb0Var4.R = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = fb0Var4.Q;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    eb0 eb0Var2 = fb0Var4.P;
                                                                                    if (eb0Var2 != null) {
                                                                                        eb0Var2.b(fb0Var4.e, tLObject2);
                                                                                    }
                                                                                    fb0Var4.finishFragment();
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
                                                fb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (fb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = fb0Var.e.request_needed;
                                            cb0Var = fb0Var.f;
                                            if (z11 != (cb0Var == null && cb0Var.e.h)) {
                                            }
                                            obj = fb0Var.G.getText().toString();
                                            if (!TextUtils.equals(fb0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i12 = fb0Var.a;
                                if (i12 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        fb0 fb0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fb0Var2.getParentActivity());
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new va0(fb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        fb0Var2.showDialog(alertDialog$Builder.a);
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
        h7.b6.a(this.I);
        this.actionBar.addView(this.I, h7.z5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        ab0 ab0Var = new ab0(this, context);
        org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(context, ab0Var, this.resourceProvider, true);
        this.F = kn0Var;
        this.actionBar.setAdaptiveBackground(kn0Var);
        gh.q4 q4Var = new gh.q4(this, context, 5);
        this.fragmentView = q4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        int i12 = 2;
        layoutTransition.setInterpolator(2, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(4, erVar);
        layoutTransition.setInterpolator(1, erVar);
        int i13 = 3;
        layoutTransition.setInterpolator(3, erVar);
        ab0Var.setLayoutTransition(layoutTransition);
        ab0Var.setOrientation(1);
        ab0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.F.addView(ab0Var);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
        this.x = j4Var;
        j4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        ab0Var.addView(this.x);
        org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
        this.d = dv0Var;
        ab0Var.addView(dv0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new u70(i12, this, context));
        this.d.setCallback(new va0(this, i12));
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i14 >= iArr.length) {
                break;
            }
            i14 = i0.a.f(iArr[i14], i14, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        ab0Var.addView(this.w, h7.z5.n(-1, 50));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.y = x8Var;
        x8Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        ab0Var.addView(this.y);
        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(context);
        this.A = j4Var2;
        j4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        ab0Var.addView(this.A);
        org.telegram.ui.Components.dv0 dv0Var2 = new org.telegram.ui.Components.dv0(context, null);
        this.c = dv0Var2;
        dv0Var2.setCallback(new va0(this, i13));
        X();
        ab0Var.addView(this.c);
        bb0 bb0Var = new bb0(context, 0);
        this.B = bb0Var;
        bb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.B.setGravity(16);
        this.B.setTextSize(1, 16.0f);
        this.B.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.B.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.B.setInputType(2);
        this.B.addTextChangedListener(new za0(this, 1));
        ab0Var.addView(this.B, h7.z5.n(-1, 50));
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.C = x8Var2;
        x8Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        ab0Var.addView(this.C);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        cb0 cb0Var = new cb0(context);
        this.f = cb0Var;
        int i15 = org.telegram.ui.ActionBar.g6.d6;
        cb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f.setTag(Integer.valueOf(i15));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new jh.a2(7, this, z10));
        ab0Var.addView(this.f, h7.z5.n(-1, 56));
        org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.h = x8Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            x8Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        ab0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
                this.n = p8Var;
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new u70(3, this, new Runnable[1]));
                ab0Var.addView(this.n, h7.z5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                db0 db0Var = new db0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = db0Var;
                db0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i15));
                db0 db0Var2 = this.r;
                db0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(db0Var2, 4);
                org.telegram.ui.Cells.e3 e3Var = db0Var2.b;
                e3Var.setImeOptions(6);
                e3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.r.addView(this.s, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                db0 db0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                db0Var3.getClass();
                ImageView imageView = new ImageView(db0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                db0Var3.addView(imageView, h7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.e3 e3Var2 = db0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                e3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                ab0Var.addView(this.r, h7.z5.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
                this.v = x8Var4;
                if (this.e != null) {
                    x8Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    x8Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new ua0(this, 2)));
                }
                ab0Var.addView(this.v, h7.z5.n(-1, -2));
            }
        }
        bb0 bb0Var2 = new bb0(context, 1);
        this.G = bb0Var2;
        bb0Var2.addTextChangedListener(new za0(this, 0));
        this.G.setCursorVisible(false);
        this.G.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.G.setGravity(16);
        this.G.setHint(LocaleController.getString(R.string.LinkNameHint));
        bb0 bb0Var3 = this.G;
        int i16 = org.telegram.ui.ActionBar.g6.y6;
        bb0Var3.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.G.setLines(1);
        this.G.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.G.setSingleLine();
        bb0 bb0Var4 = this.G;
        int i17 = org.telegram.ui.ActionBar.g6.G6;
        bb0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.G.setTextSize(1, 16.0f);
        ab0Var.addView(this.G, h7.z5.n(-1, 50));
        org.telegram.ui.Cells.x8 x8Var5 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.H = x8Var5;
        x8Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        ab0Var.addView(this.H);
        if (i10 == 1) {
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.E = x9Var;
            x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.E.b(LocaleController.getString(R.string.RevokeLink), false);
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
            final int i18 = 1;
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ya0
                public final /* synthetic */ fb0 b;

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
                    cb0 cb0Var2;
                    String obj;
                    switch (i18) {
                        case 0:
                            final fb0 fb0Var = this.b;
                            long j11 = fb0Var.b;
                            ArrayList arrayList2 = fb0Var.N;
                            ArrayList arrayList22 = fb0Var.L;
                            if (!fb0Var.R) {
                                int selectedIndex = fb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(fb0Var.w);
                                    Vibrator vibrator = (Vibrator) fb0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.p8 p8Var2 = fb0Var.n;
                                    if (p8Var2 != null && p8Var2.e.h) {
                                        try {
                                            j102 = Long.parseLong(fb0Var.r.b.getText().toString());
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        i122 = fb0Var.a;
                                        if (i122 != 0) {
                                            org.telegram.ui.ActionBar.b2 b2Var = fb0Var.Q;
                                            if (b2Var != null) {
                                                b2Var.dismiss();
                                            }
                                            fb0Var.R = true;
                                            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                            fb0Var.Q = b2Var2;
                                            b2Var2.q(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = fb0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = fb0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            cb0 cb0Var22 = fb0Var.f;
                                            boolean z12 = cb0Var22 != null && cb0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = fb0Var.G.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j102 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = fb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j102;
                                            }
                                            final int i132 = 0;
                                            fb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.wa0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i132) {
                                                        case 0:
                                                            final int i142 = 0;
                                                            final fb0 fb0Var2 = fb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i142) {
                                                                        case 0:
                                                                            fb0 fb0Var32 = fb0Var2;
                                                                            fb0Var32.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = fb0Var32.Q;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                eb0 eb0Var = fb0Var32.P;
                                                                                if (eb0Var != null) {
                                                                                    eb0Var.c(tLObject);
                                                                                }
                                                                                fb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            fb0 fb0Var4 = fb0Var2;
                                                                            fb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = fb0Var4.Q;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                eb0 eb0Var2 = fb0Var4.P;
                                                                                if (eb0Var2 != null) {
                                                                                    eb0Var2.b(fb0Var4.e, tLObject2);
                                                                                }
                                                                                fb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i152 = 1;
                                                            final fb0 fb0Var3 = fb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            fb0 fb0Var32 = fb0Var3;
                                                                            fb0Var32.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = fb0Var32.Q;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                eb0 eb0Var = fb0Var32.P;
                                                                                if (eb0Var != null) {
                                                                                    eb0Var.c(tLObject);
                                                                                }
                                                                                fb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            fb0 fb0Var4 = fb0Var3;
                                                                            fb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = fb0Var4.Q;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                eb0 eb0Var2 = fb0Var4.P;
                                                                                if (eb0Var2 != null) {
                                                                                    eb0Var2.b(fb0Var4.e, tLObject2);
                                                                                }
                                                                                fb0Var4.finishFragment();
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
                                            org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var.Q;
                                            if (b2Var3 != null) {
                                                b2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = fb0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                            int selectedIndex4 = fb0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (fb0Var.S != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (fb0Var.S != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = fb0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (fb0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = fb0Var.e.request_needed;
                                                cb0Var2 = fb0Var.f;
                                                if (z11 != (cb0Var2 == null && cb0Var2.e.h)) {
                                                    int i142 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i142 | 8;
                                                    boolean z13 = cb0Var2 != null && cb0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i142 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = fb0Var.G.getText().toString();
                                                if (!TextUtils.equals(fb0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    fb0Var.R = true;
                                                    org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                                    fb0Var.Q = b2Var4;
                                                    b2Var4.q(500L);
                                                    final int i152 = 1;
                                                    fb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.wa0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i152) {
                                                                case 0:
                                                                    final int i1422 = 0;
                                                                    final fb0 fb0Var2 = fb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1422) {
                                                                                case 0:
                                                                                    fb0 fb0Var32 = fb0Var2;
                                                                                    fb0Var32.R = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = fb0Var32.Q;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        eb0 eb0Var = fb0Var32.P;
                                                                                        if (eb0Var != null) {
                                                                                            eb0Var.c(tLObject);
                                                                                        }
                                                                                        fb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    fb0 fb0Var4 = fb0Var2;
                                                                                    fb0Var4.R = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = fb0Var4.Q;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        eb0 eb0Var2 = fb0Var4.P;
                                                                                        if (eb0Var2 != null) {
                                                                                            eb0Var2.b(fb0Var4.e, tLObject2);
                                                                                        }
                                                                                        fb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1522 = 1;
                                                                    final fb0 fb0Var3 = fb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    fb0 fb0Var32 = fb0Var3;
                                                                                    fb0Var32.R = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = fb0Var32.Q;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(fb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        eb0 eb0Var = fb0Var32.P;
                                                                                        if (eb0Var != null) {
                                                                                            eb0Var.c(tLObject);
                                                                                        }
                                                                                        fb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    fb0 fb0Var4 = fb0Var3;
                                                                                    fb0Var4.R = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = fb0Var4.Q;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        eb0 eb0Var2 = fb0Var4.P;
                                                                                        if (eb0Var2 != null) {
                                                                                            eb0Var2.b(fb0Var4.e, tLObject2);
                                                                                        }
                                                                                        fb0Var4.finishFragment();
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
                                                    fb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (fb0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = fb0Var.e.request_needed;
                                                cb0Var2 = fb0Var.f;
                                                if (z11 != (cb0Var2 == null && cb0Var2.e.h)) {
                                                }
                                                obj = fb0Var.G.getText().toString();
                                                if (!TextUtils.equals(fb0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j102 = 0;
                                    i122 = fb0Var.a;
                                    if (i122 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            fb0 fb0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fb0Var2.getParentActivity());
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new va0(fb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            fb0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            ab0Var.addView(this.E);
        }
        q4Var.addView(this.F, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        int i19 = org.telegram.ui.ActionBar.g6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i19));
        new lh.a4(q4Var, false, new cg.h(5));
        q4Var.addView(this.D, h7.z5.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.A.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.G.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        q4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.B.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.B.setCursorVisible(false);
        Y(this.e);
        q4Var.setClipChildren(false);
        this.F.setClipChildren(false);
        ab0Var.setClipChildren(false);
        return q4Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        this.F.getLayoutParams().height = this.F.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.j4 j4Var = this.x;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(j4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.p7));
        return arrayList;
    }
}
