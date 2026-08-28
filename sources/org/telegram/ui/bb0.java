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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bb0 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Cells.m4 A;
    public xa0 B;
    public org.telegram.ui.Cells.b9 C;
    public FrameLayout D;
    public org.telegram.ui.Cells.ba E;
    public org.telegram.ui.Components.in0 F;
    public xa0 G;
    public org.telegram.ui.Cells.b9 H;
    public TextView I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final int[] M;
    public final ArrayList N;
    public final int[] O;
    public ab0 P;
    public org.telegram.ui.ActionBar.c2 Q;
    public boolean R;
    public int S;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.bv0 c;
    public org.telegram.ui.Components.bv0 d;
    public TLRPC.TL_chatInviteExported e;
    public ya0 f;
    public org.telegram.ui.Cells.b9 h;
    public org.telegram.ui.Cells.t8 n;
    public za0 r;
    public TextView s;
    public org.telegram.ui.Cells.b9 v;
    public TextView w;
    public org.telegram.ui.Cells.m4 x;
    public org.telegram.ui.Cells.b9 y;

    public bb0(int i9, long j10) {
        super(null);
        this.J = -3;
        this.L = new ArrayList();
        this.M = new int[]{3600, 86400, 604800};
        this.N = new ArrayList();
        this.O = new int[]{1, 10, 100};
        this.a = i9;
        this.b = j10;
    }

    public final void U(int i9) {
        int[] iArr;
        long j10 = i9;
        this.w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i9 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            iArr = this.M;
            if (i10 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i10]) {
                arrayList.add(Integer.valueOf(currentTime));
                i11 = i10;
                z10 = true;
            }
            i10 = j3.r0.e(iArr[i10], i10, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i11 = iArr.length;
        }
        int size = arrayList.size();
        int i12 = size + 1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == size) {
                strArr[i13] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[0]) {
                strArr[i13] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[1]) {
                strArr[i13] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i13)).intValue() == iArr[2]) {
                strArr[i13] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i13] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j11 < 31449600) {
                    strArr[i13] = LocaleController.getInstance().getFormatterScheduleDay().format(j10 * 1000);
                } else {
                    strArr[i13] = LocaleController.getInstance().getFormatterYear().format(j10 * 1000);
                }
            }
        }
        this.d.b(i11, null, strArr);
    }

    public final void V(int i9) {
        int[] iArr;
        int i10;
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.O;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && i9 <= (i10 = iArr[i11])) {
                if (i9 != i10) {
                    arrayList.add(Integer.valueOf(i9));
                }
                i12 = i11;
                z10 = true;
            }
            i11 = j3.r0.e(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i9));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i14] = ((Integer) arrayList.get(i14)).toString();
            }
        }
        this.c.b(i12, null, strArr);
    }

    public final void W() {
        ArrayList arrayList = this.N;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            int[] iArr = this.O;
            if (i9 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            i9 = j3.r0.e(iArr[i9], i9, 1, arrayList);
        }
    }

    public final void X(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i9 = tL_chatInviteExported.expire_date;
        if (i9 > 0) {
            U(i9);
            this.S = ((Integer) this.L.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.S = 0;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            V(i10);
            this.B.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        ya0 ya0Var = this.f;
        if (ya0Var != null) {
            ya0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Y(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.G.getPaint().getFontMetricsInt(), false);
            this.G.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.t8 t8Var = this.n;
        if (t8Var != null) {
            t8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            ya0 ya0Var2 = this.f;
            if (ya0Var2 != null) {
                ya0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.b9 b9Var = this.h;
            if (b9Var != null) {
                b9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        za0 za0Var = this.r;
        if (za0Var != null) {
            za0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.b.setClickable(false);
            this.r.b.setFocusable(false);
            this.r.b.setFocusableInTouchMode(false);
            this.r.b.setLongClickable(false);
        }
    }

    public final void Y(boolean z10) {
        this.A.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.B.setVisibility(z10 ? 0 : 8);
        this.C.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.a;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 28));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.f5(1));
        this.I.setEllipsize(TextUtils.TruncateAt.END);
        this.I.setGravity(17);
        final int i11 = 0;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ua0
            public final /* synthetic */ bb0 b;

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
                ya0 ya0Var;
                String obj;
                switch (i11) {
                    case 0:
                        final bb0 bb0Var = this.b;
                        long j11 = bb0Var.b;
                        ArrayList arrayList = bb0Var.N;
                        ArrayList arrayList2 = bb0Var.L;
                        if (!bb0Var.R) {
                            int selectedIndex = bb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(bb0Var.w);
                                Vibrator vibrator = (Vibrator) bb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.t8 t8Var = bb0Var.n;
                                if (t8Var != null && t8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(bb0Var.r.b.getText().toString());
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    i12 = bb0Var.a;
                                    if (i12 != 0) {
                                        org.telegram.ui.ActionBar.c2 c2Var = bb0Var.Q;
                                        if (c2Var != null) {
                                            c2Var.dismiss();
                                        }
                                        bb0Var.R = true;
                                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(bb0Var.getParentActivity(), 3, null);
                                        bb0Var.Q = c2Var2;
                                        c2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = bb0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = bb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = bb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = bb0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        ya0 ya0Var2 = bb0Var.f;
                                        boolean z12 = ya0Var2 != null && ya0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = bb0Var.G.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = bb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        final int i13 = 0;
                                        bb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.sa0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final bb0 bb0Var2 = bb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        bb0 bb0Var3 = bb0Var2;
                                                                        bb0Var3.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var3 = bb0Var3.Q;
                                                                        if (c2Var3 != null) {
                                                                            c2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(bb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            ab0 ab0Var = bb0Var3.P;
                                                                            if (ab0Var != null) {
                                                                                ab0Var.c(tLObject);
                                                                            }
                                                                            bb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        bb0 bb0Var4 = bb0Var2;
                                                                        bb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var4 = bb0Var4.Q;
                                                                        if (c2Var4 != null) {
                                                                            c2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            ab0 ab0Var2 = bb0Var4.P;
                                                                            if (ab0Var2 != null) {
                                                                                ab0Var2.b(bb0Var4.e, tLObject2);
                                                                            }
                                                                            bb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final bb0 bb0Var3 = bb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        bb0 bb0Var32 = bb0Var3;
                                                                        bb0Var32.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var3 = bb0Var32.Q;
                                                                        if (c2Var3 != null) {
                                                                            c2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            ab0 ab0Var = bb0Var32.P;
                                                                            if (ab0Var != null) {
                                                                                ab0Var.c(tLObject);
                                                                            }
                                                                            bb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        bb0 bb0Var4 = bb0Var3;
                                                                        bb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var4 = bb0Var4.Q;
                                                                        if (c2Var4 != null) {
                                                                            c2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            ab0 ab0Var2 = bb0Var4.P;
                                                                            if (ab0Var2 != null) {
                                                                                ab0Var2.b(bb0Var4.e, tLObject2);
                                                                            }
                                                                            bb0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.c2 c2Var3 = bb0Var.Q;
                                        if (c2Var3 != null) {
                                            c2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = bb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = bb0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = bb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (bb0Var.S != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = bb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (bb0Var.S != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = bb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (bb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = bb0Var.e.request_needed;
                                            ya0Var = bb0Var.f;
                                            if (z11 != (ya0Var == null && ya0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z13 = ya0Var != null && ya0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = bb0Var.G.getText().toString();
                                            if (!TextUtils.equals(bb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                bb0Var.R = true;
                                                org.telegram.ui.ActionBar.c2 c2Var4 = new org.telegram.ui.ActionBar.c2(bb0Var.getParentActivity(), 3, null);
                                                bb0Var.Q = c2Var4;
                                                c2Var4.q(500L);
                                                final int i15 = 1;
                                                bb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.sa0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i15) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final bb0 bb0Var2 = bb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                bb0 bb0Var32 = bb0Var2;
                                                                                bb0Var32.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var32 = bb0Var32.Q;
                                                                                if (c2Var32 != null) {
                                                                                    c2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    ab0 ab0Var = bb0Var32.P;
                                                                                    if (ab0Var != null) {
                                                                                        ab0Var.c(tLObject);
                                                                                    }
                                                                                    bb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                bb0 bb0Var4 = bb0Var2;
                                                                                bb0Var4.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var42 = bb0Var4.Q;
                                                                                if (c2Var42 != null) {
                                                                                    c2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    ab0 ab0Var2 = bb0Var4.P;
                                                                                    if (ab0Var2 != null) {
                                                                                        ab0Var2.b(bb0Var4.e, tLObject2);
                                                                                    }
                                                                                    bb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i152 = 1;
                                                                final bb0 bb0Var3 = bb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                bb0 bb0Var32 = bb0Var3;
                                                                                bb0Var32.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var32 = bb0Var32.Q;
                                                                                if (c2Var32 != null) {
                                                                                    c2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    ab0 ab0Var = bb0Var32.P;
                                                                                    if (ab0Var != null) {
                                                                                        ab0Var.c(tLObject);
                                                                                    }
                                                                                    bb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                bb0 bb0Var4 = bb0Var3;
                                                                                bb0Var4.R = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var42 = bb0Var4.Q;
                                                                                if (c2Var42 != null) {
                                                                                    c2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    ab0 ab0Var2 = bb0Var4.P;
                                                                                    if (ab0Var2 != null) {
                                                                                        ab0Var2.b(bb0Var4.e, tLObject2);
                                                                                    }
                                                                                    bb0Var4.finishFragment();
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
                                                bb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (bb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = bb0Var.e.request_needed;
                                            ya0Var = bb0Var.f;
                                            if (z11 != (ya0Var == null && ya0Var.e.h)) {
                                            }
                                            obj = bb0Var.G.getText().toString();
                                            if (!TextUtils.equals(bb0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i12 = bb0Var.a;
                                if (i12 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        bb0 bb0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb0Var2.getParentActivity());
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ra0(bb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        bb0Var2.showDialog(alertDialog$Builder.a);
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
        this.I.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        g7.g6.a(this.I);
        this.actionBar.addView(this.I, g7.e6.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        wa0 wa0Var = new wa0(this, context);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(context, wa0Var, this.resourceProvider, true);
        this.F = in0Var;
        this.actionBar.setAdaptiveBackground(in0Var);
        fh.x4 x4Var = new fh.x4(this, context, 5);
        this.fragmentView = x4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(4, grVar);
        layoutTransition.setInterpolator(1, grVar);
        int i12 = 3;
        layoutTransition.setInterpolator(3, grVar);
        wa0Var.setLayoutTransition(layoutTransition);
        wa0Var.setOrientation(1);
        wa0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.F.addView(wa0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        wa0Var.addView(this.x);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, null);
        this.d = bv0Var;
        wa0Var.addView(bv0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new v80(i9, this, context));
        this.d.setCallback(new ra0(this, 2));
        ArrayList arrayList = this.L;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = j3.r0.e(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        wa0Var.addView(this.w, g7.e6.n(-1, 50));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.y = b9Var;
        b9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        wa0Var.addView(this.y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.A = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        wa0Var.addView(this.A);
        org.telegram.ui.Components.bv0 bv0Var2 = new org.telegram.ui.Components.bv0(context, null);
        this.c = bv0Var2;
        bv0Var2.setCallback(new ra0(this, i12));
        W();
        wa0Var.addView(this.c);
        xa0 xa0Var = new xa0(context, 0);
        this.B = xa0Var;
        xa0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.B.setGravity(16);
        this.B.setTextSize(1, 16.0f);
        this.B.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.B.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.B.setInputType(2);
        this.B.addTextChangedListener(new va0(this, 1));
        wa0Var.addView(this.B, g7.e6.n(-1, 50));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.C = b9Var2;
        b9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        wa0Var.addView(this.C);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        ya0 ya0Var = new ya0(context);
        this.f = ya0Var;
        int i14 = org.telegram.ui.ActionBar.f6.d6;
        ya0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.f.setTag(Integer.valueOf(i14));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new ih.b2(7, this, z10));
        wa0Var.addView(this.f, g7.e6.n(-1, 56));
        org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.h = b9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            b9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        wa0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
                this.n = t8Var;
                t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new v80(2, this, new Runnable[1]));
                wa0Var.addView(this.n, g7.e6.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
                za0 za0Var = new za0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = za0Var;
                za0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i14));
                za0 za0Var2 = this.r;
                za0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(za0Var2, 4);
                org.telegram.ui.Cells.h3 h3Var = za0Var2.b;
                h3Var.setImeOptions(6);
                h3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.r.addView(this.s, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                za0 za0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                za0Var3.getClass();
                ImageView imageView = new ImageView(za0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                za0Var3.addView(imageView, g7.e6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.h3 h3Var2 = za0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                h3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                wa0Var.addView(this.r, g7.e6.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
                this.v = b9Var4;
                if (this.e != null) {
                    b9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    b9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new qa0(this, 2)));
                }
                wa0Var.addView(this.v, g7.e6.n(-1, -2));
            }
        }
        xa0 xa0Var2 = new xa0(context, 1);
        this.G = xa0Var2;
        xa0Var2.addTextChangedListener(new va0(this, 0));
        this.G.setCursorVisible(false);
        this.G.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.G.setGravity(16);
        this.G.setHint(LocaleController.getString(R.string.LinkNameHint));
        xa0 xa0Var3 = this.G;
        int i15 = org.telegram.ui.ActionBar.f6.y6;
        xa0Var3.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        this.G.setLines(1);
        this.G.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.G.setSingleLine();
        xa0 xa0Var4 = this.G;
        int i16 = org.telegram.ui.ActionBar.f6.G6;
        xa0Var4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.G.setTextSize(1, 16.0f);
        wa0Var.addView(this.G, g7.e6.n(-1, 50));
        org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        this.H = b9Var5;
        b9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        wa0Var.addView(this.H);
        if (i10 == 1) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.E = baVar;
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.E.b(LocaleController.getString(R.string.RevokeLink), false);
            this.E.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
            final int i17 = 1;
            this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ua0
                public final /* synthetic */ bb0 b;

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
                    ya0 ya0Var2;
                    String obj;
                    switch (i17) {
                        case 0:
                            final bb0 bb0Var = this.b;
                            long j11 = bb0Var.b;
                            ArrayList arrayList2 = bb0Var.N;
                            ArrayList arrayList22 = bb0Var.L;
                            if (!bb0Var.R) {
                                int selectedIndex = bb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(bb0Var.w);
                                    Vibrator vibrator = (Vibrator) bb0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.t8 t8Var2 = bb0Var.n;
                                    if (t8Var2 != null && t8Var2.e.h) {
                                        try {
                                            j102 = Long.parseLong(bb0Var.r.b.getText().toString());
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        i122 = bb0Var.a;
                                        if (i122 != 0) {
                                            org.telegram.ui.ActionBar.c2 c2Var = bb0Var.Q;
                                            if (c2Var != null) {
                                                c2Var.dismiss();
                                            }
                                            bb0Var.R = true;
                                            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(bb0Var.getParentActivity(), 3, null);
                                            bb0Var.Q = c2Var2;
                                            c2Var2.q(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = bb0Var.getMessagesController().getInputPeer(-j11);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = bb0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = bb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = bb0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            ya0 ya0Var22 = bb0Var.f;
                                            boolean z12 = ya0Var22 != null && ya0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = bb0Var.G.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j102 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = bb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j102;
                                            }
                                            final int i132 = 0;
                                            bb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.sa0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i132) {
                                                        case 0:
                                                            final int i142 = 0;
                                                            final bb0 bb0Var2 = bb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i142) {
                                                                        case 0:
                                                                            bb0 bb0Var32 = bb0Var2;
                                                                            bb0Var32.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var32 = bb0Var32.Q;
                                                                            if (c2Var32 != null) {
                                                                                c2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                ab0 ab0Var = bb0Var32.P;
                                                                                if (ab0Var != null) {
                                                                                    ab0Var.c(tLObject);
                                                                                }
                                                                                bb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            bb0 bb0Var4 = bb0Var2;
                                                                            bb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var42 = bb0Var4.Q;
                                                                            if (c2Var42 != null) {
                                                                                c2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                ab0 ab0Var2 = bb0Var4.P;
                                                                                if (ab0Var2 != null) {
                                                                                    ab0Var2.b(bb0Var4.e, tLObject2);
                                                                                }
                                                                                bb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i152 = 1;
                                                            final bb0 bb0Var3 = bb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            bb0 bb0Var32 = bb0Var3;
                                                                            bb0Var32.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var32 = bb0Var32.Q;
                                                                            if (c2Var32 != null) {
                                                                                c2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                ab0 ab0Var = bb0Var32.P;
                                                                                if (ab0Var != null) {
                                                                                    ab0Var.c(tLObject);
                                                                                }
                                                                                bb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            bb0 bb0Var4 = bb0Var3;
                                                                            bb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var42 = bb0Var4.Q;
                                                                            if (c2Var42 != null) {
                                                                                c2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                ab0 ab0Var2 = bb0Var4.P;
                                                                                if (ab0Var2 != null) {
                                                                                    ab0Var2.b(bb0Var4.e, tLObject2);
                                                                                }
                                                                                bb0Var4.finishFragment();
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
                                            org.telegram.ui.ActionBar.c2 c2Var3 = bb0Var.Q;
                                            if (c2Var3 != null) {
                                                c2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = bb0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = bb0Var.getMessagesController().getInputPeer(-j11);
                                            int selectedIndex4 = bb0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (bb0Var.S != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = bb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (bb0Var.S != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = bb0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (bb0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = bb0Var.e.request_needed;
                                                ya0Var2 = bb0Var.f;
                                                if (z11 != (ya0Var2 == null && ya0Var2.e.h)) {
                                                    int i142 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i142 | 8;
                                                    boolean z13 = ya0Var2 != null && ya0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i142 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = bb0Var.G.getText().toString();
                                                if (!TextUtils.equals(bb0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    bb0Var.R = true;
                                                    org.telegram.ui.ActionBar.c2 c2Var4 = new org.telegram.ui.ActionBar.c2(bb0Var.getParentActivity(), 3, null);
                                                    bb0Var.Q = c2Var4;
                                                    c2Var4.q(500L);
                                                    final int i152 = 1;
                                                    bb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.sa0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i152) {
                                                                case 0:
                                                                    final int i1422 = 0;
                                                                    final bb0 bb0Var2 = bb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1422) {
                                                                                case 0:
                                                                                    bb0 bb0Var32 = bb0Var2;
                                                                                    bb0Var32.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var32 = bb0Var32.Q;
                                                                                    if (c2Var32 != null) {
                                                                                        c2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        ab0 ab0Var = bb0Var32.P;
                                                                                        if (ab0Var != null) {
                                                                                            ab0Var.c(tLObject);
                                                                                        }
                                                                                        bb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    bb0 bb0Var4 = bb0Var2;
                                                                                    bb0Var4.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var42 = bb0Var4.Q;
                                                                                    if (c2Var42 != null) {
                                                                                        c2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        ab0 ab0Var2 = bb0Var4.P;
                                                                                        if (ab0Var2 != null) {
                                                                                            ab0Var2.b(bb0Var4.e, tLObject2);
                                                                                        }
                                                                                        bb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1522 = 1;
                                                                    final bb0 bb0Var3 = bb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ta0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    bb0 bb0Var32 = bb0Var3;
                                                                                    bb0Var32.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var32 = bb0Var32.Q;
                                                                                    if (c2Var32 != null) {
                                                                                        c2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(bb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        ab0 ab0Var = bb0Var32.P;
                                                                                        if (ab0Var != null) {
                                                                                            ab0Var.c(tLObject);
                                                                                        }
                                                                                        bb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    bb0 bb0Var4 = bb0Var3;
                                                                                    bb0Var4.R = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var42 = bb0Var4.Q;
                                                                                    if (c2Var42 != null) {
                                                                                        c2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.y4.u0(bb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            bb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        ab0 ab0Var2 = bb0Var4.P;
                                                                                        if (ab0Var2 != null) {
                                                                                            ab0Var2.b(bb0Var4.e, tLObject2);
                                                                                        }
                                                                                        bb0Var4.finishFragment();
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
                                                    bb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (bb0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = bb0Var.e.request_needed;
                                                ya0Var2 = bb0Var.f;
                                                if (z11 != (ya0Var2 == null && ya0Var2.e.h)) {
                                                }
                                                obj = bb0Var.G.getText().toString();
                                                if (!TextUtils.equals(bb0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j102 = 0;
                                    i122 = bb0Var.a;
                                    if (i122 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            bb0 bb0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb0Var2.getParentActivity());
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ra0(bb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            bb0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            wa0Var.addView(this.E);
        }
        x4Var.addView(this.F, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        int i18 = org.telegram.ui.ActionBar.f6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i18));
        new kh.b4(x4Var, false, new bg.k(5));
        x4Var.addView(this.D, g7.e6.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.A.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        this.G.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        x4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.B.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        this.B.setCursorVisible(false);
        X(this.e);
        x4Var.setClipChildren(false);
        this.F.setClipChildren(false);
        wa0Var.setClipChildren(false);
        return x4Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        this.F.getLayoutParams().height = this.F.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        org.telegram.ui.Cells.m4 m4Var = this.x;
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(m4Var, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.y, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.p7));
        return arrayList;
    }
}
