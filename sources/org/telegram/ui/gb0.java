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
import java.util.HashSet;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class gb0 extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Cells.l4 E;
    public cb0 F;
    public org.telegram.ui.Cells.e9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ca I;
    public org.telegram.ui.Components.bp0 J;
    public cb0 K;
    public org.telegram.ui.Cells.e9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public fb0 T;
    public org.telegram.ui.ActionBar.c2 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.sw0 c;
    public org.telegram.ui.Components.sw0 d;
    public TLRPC.TL_chatInviteExported e;
    public db0 f;
    public org.telegram.ui.Cells.e9 h;
    public org.telegram.ui.Cells.w8 n;
    public eb0 r;
    public TextView s;
    public org.telegram.ui.Cells.e9 v;
    public TextView w;
    public org.telegram.ui.Cells.l4 x;
    public org.telegram.ui.Cells.e9 y;

    public gb0(int i10, long j10) {
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
        db0 db0Var = this.f;
        if (db0Var != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, db0Var, null);
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
            this.K.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.w8 w8Var = this.n;
        if (w8Var != null) {
            w8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            db0 db0Var2 = this.f;
            if (db0Var2 != null) {
                db0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.e9 e9Var = this.h;
            if (e9Var != null) {
                e9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        eb0 eb0Var = this.r;
        if (eb0Var != null) {
            eb0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.d.setClickable(false);
            this.r.d.setFocusable(false);
            this.r.d.setFocusableInTouchMode(false);
            this.r.d.setLongClickable(false);
        }
    }

    public final void Z(boolean z10) {
        this.E.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.F.setVisibility(z10 ? 0 : 8);
        this.G.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.a;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 6));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.l5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        final int i12 = 0;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va0
            public final /* synthetic */ gb0 b;

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
                int i13;
                boolean z10;
                boolean z11;
                db0 db0Var;
                String obj;
                switch (i12) {
                    case 0:
                        final gb0 gb0Var = this.b;
                        long j11 = gb0Var.b;
                        ArrayList arrayList = gb0Var.R;
                        ArrayList arrayList2 = gb0Var.P;
                        if (!gb0Var.V) {
                            int selectedIndex = gb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(gb0Var.w);
                                Vibrator vibrator = (Vibrator) gb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.w8 w8Var = gb0Var.n;
                                if (w8Var != null && w8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(gb0Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    i13 = gb0Var.a;
                                    if (i13 != 0) {
                                        org.telegram.ui.ActionBar.c2 c2Var = gb0Var.U;
                                        if (c2Var != null) {
                                            c2Var.dismiss();
                                        }
                                        gb0Var.V = true;
                                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(gb0Var.getParentActivity(), 3, null);
                                        gb0Var.U = c2Var2;
                                        c2Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = gb0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = gb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = gb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = gb0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        db0 db0Var2 = gb0Var.f;
                                        boolean z12 = db0Var2 != null && db0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = gb0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = gb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        final int i14 = 0;
                                        gb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ya0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i14) {
                                                    case 0:
                                                        final int i15 = 0;
                                                        final gb0 gb0Var2 = gb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        gb0 gb0Var3 = gb0Var2;
                                                                        gb0Var3.V = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var3 = gb0Var3.U;
                                                                        if (c2Var3 != null) {
                                                                            c2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.f5.u0(gb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            fb0 fb0Var = gb0Var3.T;
                                                                            if (fb0Var != null) {
                                                                                fb0Var.c(tLObject);
                                                                            }
                                                                            gb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        gb0 gb0Var4 = gb0Var2;
                                                                        gb0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var4 = gb0Var4.U;
                                                                        if (c2Var4 != null) {
                                                                            c2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            fb0 fb0Var2 = gb0Var4.T;
                                                                            if (fb0Var2 != null) {
                                                                                fb0Var2.b(gb0Var4.e, tLObject2);
                                                                            }
                                                                            gb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i16 = 1;
                                                        final gb0 gb0Var3 = gb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i16) {
                                                                    case 0:
                                                                        gb0 gb0Var32 = gb0Var3;
                                                                        gb0Var32.V = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var3 = gb0Var32.U;
                                                                        if (c2Var3 != null) {
                                                                            c2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            fb0 fb0Var = gb0Var32.T;
                                                                            if (fb0Var != null) {
                                                                                fb0Var.c(tLObject);
                                                                            }
                                                                            gb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        gb0 gb0Var4 = gb0Var3;
                                                                        gb0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.c2 c2Var4 = gb0Var4.U;
                                                                        if (c2Var4 != null) {
                                                                            c2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            fb0 fb0Var2 = gb0Var4.T;
                                                                            if (fb0Var2 != null) {
                                                                                fb0Var2.b(gb0Var4.e, tLObject2);
                                                                            }
                                                                            gb0Var4.finishFragment();
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
                                    } else if (i13 == 1) {
                                        org.telegram.ui.ActionBar.c2 c2Var3 = gb0Var.U;
                                        if (c2Var3 != null) {
                                            c2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = gb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = gb0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = gb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (gb0Var.W != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = gb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (gb0Var.W != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = gb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (gb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = gb0Var.e.request_needed;
                                            db0Var = gb0Var.f;
                                            if (z11 != (db0Var == null && db0Var.e.h)) {
                                                int i15 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i15 | 8;
                                                boolean z13 = db0Var != null && db0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i15 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = gb0Var.K.getText().toString();
                                            if (!TextUtils.equals(gb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                gb0Var.V = true;
                                                org.telegram.ui.ActionBar.c2 c2Var4 = new org.telegram.ui.ActionBar.c2(gb0Var.getParentActivity(), 3, null);
                                                gb0Var.U = c2Var4;
                                                c2Var4.r(500L);
                                                final int i16 = 1;
                                                gb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ya0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i16) {
                                                            case 0:
                                                                final int i152 = 0;
                                                                final gb0 gb0Var2 = gb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                gb0 gb0Var32 = gb0Var2;
                                                                                gb0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var32 = gb0Var32.U;
                                                                                if (c2Var32 != null) {
                                                                                    c2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    fb0 fb0Var = gb0Var32.T;
                                                                                    if (fb0Var != null) {
                                                                                        fb0Var.c(tLObject);
                                                                                    }
                                                                                    gb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                gb0 gb0Var4 = gb0Var2;
                                                                                gb0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var42 = gb0Var4.U;
                                                                                if (c2Var42 != null) {
                                                                                    c2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    fb0 fb0Var2 = gb0Var4.T;
                                                                                    if (fb0Var2 != null) {
                                                                                        fb0Var2.b(gb0Var4.e, tLObject2);
                                                                                    }
                                                                                    gb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i162 = 1;
                                                                final gb0 gb0Var3 = gb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i162) {
                                                                            case 0:
                                                                                gb0 gb0Var32 = gb0Var3;
                                                                                gb0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var32 = gb0Var32.U;
                                                                                if (c2Var32 != null) {
                                                                                    c2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    fb0 fb0Var = gb0Var32.T;
                                                                                    if (fb0Var != null) {
                                                                                        fb0Var.c(tLObject);
                                                                                    }
                                                                                    gb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                gb0 gb0Var4 = gb0Var3;
                                                                                gb0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.c2 c2Var42 = gb0Var4.U;
                                                                                if (c2Var42 != null) {
                                                                                    c2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    fb0 fb0Var2 = gb0Var4.T;
                                                                                    if (fb0Var2 != null) {
                                                                                        fb0Var2.b(gb0Var4.e, tLObject2);
                                                                                    }
                                                                                    gb0Var4.finishFragment();
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
                                                gb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (gb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = gb0Var.e.request_needed;
                                            db0Var = gb0Var.f;
                                            if (z11 != (db0Var == null && db0Var.e.h)) {
                                            }
                                            obj = gb0Var.K.getText().toString();
                                            if (!TextUtils.equals(gb0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i13 = gb0Var.a;
                                if (i13 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        gb0 gb0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gb0Var2.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new xa0(gb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        gb0Var2.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        this.M.setSingleLine();
        if (i11 == 0) {
            this.M.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i11 == 1) {
            this.M.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        org.telegram.ui.ActionBar.r6.W(this.M, org.telegram.ui.ActionBar.k6.Sh, null);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.b6.a(this.M);
        this.actionBar.addView(this.M, w7.z5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        bb0 bb0Var = new bb0(this, context);
        org.telegram.ui.Components.bp0 bp0Var = new org.telegram.ui.Components.bp0(context, bb0Var, this.resourceProvider, true);
        this.J = bp0Var;
        this.actionBar.setAdaptiveBackground(bp0Var);
        y8 y8Var = new y8(this, context, 4);
        this.fragmentView = y8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        layoutTransition.setInterpolator(2, bsVar);
        layoutTransition.setInterpolator(0, bsVar);
        layoutTransition.setInterpolator(4, bsVar);
        layoutTransition.setInterpolator(1, bsVar);
        int i13 = 3;
        layoutTransition.setInterpolator(3, bsVar);
        bb0Var.setLayoutTransition(layoutTransition);
        bb0Var.setOrientation(1);
        bb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(bb0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        bb0Var.addView(this.x);
        org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(context, null);
        this.d = sw0Var;
        bb0Var.addView(sw0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new org.telegram.ui.Components.d51(25, this, context));
        this.d.setCallback(new xa0(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i14 >= iArr.length) {
                break;
            }
            i14 = com.google.android.gms.internal.play_billing.k3.f(iArr[i14], i14, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        bb0Var.addView(this.w, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.y = e9Var;
        e9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        bb0Var.addView(this.y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.E = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        bb0Var.addView(this.E);
        org.telegram.ui.Components.sw0 sw0Var2 = new org.telegram.ui.Components.sw0(context, null);
        this.c = sw0Var2;
        sw0Var2.setCallback(new xa0(this, i13));
        X();
        bb0Var.addView(this.c);
        cb0 cb0Var = new cb0(context, 0);
        this.F = cb0Var;
        cb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new ab0(this, 1));
        bb0Var.addView(this.F, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.G = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        bb0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j10 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        db0 db0Var = new db0(context);
        this.f = db0Var;
        int i15 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i15, db0Var, null);
        this.f.setTag(Integer.valueOf(i15));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new ci.g2(7, this, z10));
        bb0Var.addView(this.f, w7.z5.n(-1, 56));
        org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.h = e9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            e9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        bb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
                this.n = w8Var;
                org.telegram.ui.ActionBar.r6.i(i15, w8Var, null);
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new org.telegram.ui.Components.d51(26, this, new Runnable[1]));
                bb0Var.addView(this.n, w7.z5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.W(this.s, org.telegram.ui.ActionBar.k6.A6, null);
                eb0 eb0Var = new eb0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = eb0Var;
                eb0Var.d.setInputType(2);
                this.r.d.setRawInputType(2);
                org.telegram.ui.ActionBar.r6.i(i15, this.r, getResourceProvider());
                eb0 eb0Var2 = this.r;
                eb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(eb0Var2, 4);
                org.telegram.ui.Cells.f3 f3Var = eb0Var2.d;
                f3Var.setImeOptions(6);
                f3Var.setOnEditorActionListener(new m.t2(gVar, 2));
                this.r.addView(this.s, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                eb0 eb0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                eb0Var3.getClass();
                ImageView imageView = new ImageView(eb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                eb0Var3.addView(imageView, w7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.f3 f3Var2 = eb0Var3.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                f3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                bb0Var.addView(this.r, w7.z5.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
                this.v = e9Var4;
                if (this.e != null) {
                    e9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new wa0(this, i10)));
                }
                bb0Var.addView(this.v, w7.z5.n(-1, -2));
            }
        }
        cb0 cb0Var2 = new cb0(context, 1);
        this.K = cb0Var2;
        cb0Var2.addTextChangedListener(new ab0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        cb0 cb0Var3 = this.K;
        int i16 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.F(cb0Var3, i16, null);
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        cb0 cb0Var4 = this.K;
        int i17 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(cb0Var4, i17, null);
        this.K.setTextSize(1, 16.0f);
        bb0Var.addView(this.K, w7.z5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.L = e9Var5;
        e9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        bb0Var.addView(this.L);
        if (i11 == 1) {
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.I = caVar;
            org.telegram.ui.ActionBar.r6.i(i15, caVar, null);
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            org.telegram.ui.ActionBar.r6.W(this.I.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
            this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.va0
                public final /* synthetic */ gb0 b;

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
                    int i132;
                    boolean z102;
                    boolean z11;
                    db0 db0Var2;
                    String obj;
                    switch (i10) {
                        case 0:
                            final gb0 gb0Var = this.b;
                            long j11 = gb0Var.b;
                            ArrayList arrayList2 = gb0Var.R;
                            ArrayList arrayList22 = gb0Var.P;
                            if (!gb0Var.V) {
                                int selectedIndex = gb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(gb0Var.w);
                                    Vibrator vibrator = (Vibrator) gb0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.w8 w8Var2 = gb0Var.n;
                                    if (w8Var2 != null && w8Var2.e.h) {
                                        try {
                                            j102 = Long.parseLong(gb0Var.r.d.getText().toString());
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        i132 = gb0Var.a;
                                        if (i132 != 0) {
                                            org.telegram.ui.ActionBar.c2 c2Var = gb0Var.U;
                                            if (c2Var != null) {
                                                c2Var.dismiss();
                                            }
                                            gb0Var.V = true;
                                            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(gb0Var.getParentActivity(), 3, null);
                                            gb0Var.U = c2Var2;
                                            c2Var2.r(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = gb0Var.getMessagesController().getInputPeer(-j11);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = gb0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = gb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = gb0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            db0 db0Var22 = gb0Var.f;
                                            boolean z12 = db0Var22 != null && db0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = gb0Var.K.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j102 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = gb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j102;
                                            }
                                            final int i142 = 0;
                                            gb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ya0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i142) {
                                                        case 0:
                                                            final int i152 = 0;
                                                            final gb0 gb0Var2 = gb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            gb0 gb0Var32 = gb0Var2;
                                                                            gb0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var32 = gb0Var32.U;
                                                                            if (c2Var32 != null) {
                                                                                c2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                fb0 fb0Var = gb0Var32.T;
                                                                                if (fb0Var != null) {
                                                                                    fb0Var.c(tLObject);
                                                                                }
                                                                                gb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            gb0 gb0Var4 = gb0Var2;
                                                                            gb0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var42 = gb0Var4.U;
                                                                            if (c2Var42 != null) {
                                                                                c2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                fb0 fb0Var2 = gb0Var4.T;
                                                                                if (fb0Var2 != null) {
                                                                                    fb0Var2.b(gb0Var4.e, tLObject2);
                                                                                }
                                                                                gb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i162 = 1;
                                                            final gb0 gb0Var3 = gb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i162) {
                                                                        case 0:
                                                                            gb0 gb0Var32 = gb0Var3;
                                                                            gb0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var32 = gb0Var32.U;
                                                                            if (c2Var32 != null) {
                                                                                c2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                fb0 fb0Var = gb0Var32.T;
                                                                                if (fb0Var != null) {
                                                                                    fb0Var.c(tLObject);
                                                                                }
                                                                                gb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            gb0 gb0Var4 = gb0Var3;
                                                                            gb0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.c2 c2Var42 = gb0Var4.U;
                                                                            if (c2Var42 != null) {
                                                                                c2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                fb0 fb0Var2 = gb0Var4.T;
                                                                                if (fb0Var2 != null) {
                                                                                    fb0Var2.b(gb0Var4.e, tLObject2);
                                                                                }
                                                                                gb0Var4.finishFragment();
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
                                        } else if (i132 == 1) {
                                            org.telegram.ui.ActionBar.c2 c2Var3 = gb0Var.U;
                                            if (c2Var3 != null) {
                                                c2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = gb0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = gb0Var.getMessagesController().getInputPeer(-j11);
                                            int selectedIndex4 = gb0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (gb0Var.W != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = gb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (gb0Var.W != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = gb0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (gb0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = gb0Var.e.request_needed;
                                                db0Var2 = gb0Var.f;
                                                if (z11 != (db0Var2 == null && db0Var2.e.h)) {
                                                    int i152 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i152 | 8;
                                                    boolean z13 = db0Var2 != null && db0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i152 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = gb0Var.K.getText().toString();
                                                if (!TextUtils.equals(gb0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    gb0Var.V = true;
                                                    org.telegram.ui.ActionBar.c2 c2Var4 = new org.telegram.ui.ActionBar.c2(gb0Var.getParentActivity(), 3, null);
                                                    gb0Var.U = c2Var4;
                                                    c2Var4.r(500L);
                                                    final int i162 = 1;
                                                    gb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ya0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i162) {
                                                                case 0:
                                                                    final int i1522 = 0;
                                                                    final gb0 gb0Var2 = gb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    gb0 gb0Var32 = gb0Var2;
                                                                                    gb0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var32 = gb0Var32.U;
                                                                                    if (c2Var32 != null) {
                                                                                        c2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        fb0 fb0Var = gb0Var32.T;
                                                                                        if (fb0Var != null) {
                                                                                            fb0Var.c(tLObject);
                                                                                        }
                                                                                        gb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    gb0 gb0Var4 = gb0Var2;
                                                                                    gb0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var42 = gb0Var4.U;
                                                                                    if (c2Var42 != null) {
                                                                                        c2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        fb0 fb0Var2 = gb0Var4.T;
                                                                                        if (fb0Var2 != null) {
                                                                                            fb0Var2.b(gb0Var4.e, tLObject2);
                                                                                        }
                                                                                        gb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1622 = 1;
                                                                    final gb0 gb0Var3 = gb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.za0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1622) {
                                                                                case 0:
                                                                                    gb0 gb0Var32 = gb0Var3;
                                                                                    gb0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var32 = gb0Var32.U;
                                                                                    if (c2Var32 != null) {
                                                                                        c2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.f5.u0(gb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        fb0 fb0Var = gb0Var32.T;
                                                                                        if (fb0Var != null) {
                                                                                            fb0Var.c(tLObject);
                                                                                        }
                                                                                        gb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    gb0 gb0Var4 = gb0Var3;
                                                                                    gb0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.c2 c2Var42 = gb0Var4.U;
                                                                                    if (c2Var42 != null) {
                                                                                        c2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.f5.u0(gb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            gb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        fb0 fb0Var2 = gb0Var4.T;
                                                                                        if (fb0Var2 != null) {
                                                                                            fb0Var2.b(gb0Var4.e, tLObject2);
                                                                                        }
                                                                                        gb0Var4.finishFragment();
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
                                                    gb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (gb0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = gb0Var.e.request_needed;
                                                db0Var2 = gb0Var.f;
                                                if (z11 != (db0Var2 == null && db0Var2.e.h)) {
                                                }
                                                obj = gb0Var.K.getText().toString();
                                                if (!TextUtils.equals(gb0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j102 = 0;
                                    i132 = gb0Var.a;
                                    if (i132 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            gb0 gb0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gb0Var2.getParentActivity());
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new xa0(gb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            gb0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            bb0Var.addView(this.I);
        }
        y8Var.addView(this.J, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i18 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i18, frameLayout, getResourceProvider());
        new ei.b4(y8Var, false, new ci.e(17));
        y8Var.addView(this.H, w7.z5.e(-1, -2, 80));
        org.telegram.ui.ActionBar.r6.i(i15, this.x, null);
        org.telegram.ui.ActionBar.r6.i(i15, this.d, null);
        org.telegram.ui.ActionBar.r6.i(i15, this.w, null);
        org.telegram.ui.ActionBar.r6.i(i15, this.E, null);
        org.telegram.ui.ActionBar.r6.i(i15, this.c, null);
        org.telegram.ui.ActionBar.r6.i(i15, this.F, null);
        org.telegram.ui.ActionBar.r6.i(i15, this.K, null);
        org.telegram.ui.ActionBar.r6.i(i18, y8Var, null);
        org.telegram.ui.ActionBar.r6.W(this.F, i17, null);
        org.telegram.ui.ActionBar.r6.F(this.F, i16, null);
        org.telegram.ui.ActionBar.r6.W(this.w, i17, null);
        org.telegram.ui.ActionBar.r6.F(this.w, i16, null);
        this.F.setCursorVisible(false);
        Y(this.e);
        y8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        bb0Var.setClipChildren(false);
        return y8Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }
}
