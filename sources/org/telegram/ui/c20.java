package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c20 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c20(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0483  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        long j10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        cb0 cb0Var;
        String obj;
        boolean z13;
        org.telegram.ui.ActionBar.k kVar;
        Bitmap bitmap;
        int i12 = this.a;
        final int i13 = 0;
        boolean z14 = true;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                if (i10 == -1) {
                    ((f20) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                t60 t60Var = (t60) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        t60Var.p0();
                        break;
                    }
                } else if (t60Var.g0(true)) {
                    t60Var.finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((z60) obj2).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((b70) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((h70) obj2).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((k70) obj2).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((y70) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                final fb0 fb0Var = (fb0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        long j11 = fb0Var.b;
                        ArrayList arrayList = fb0Var.Q;
                        ArrayList arrayList2 = fb0Var.O;
                        if (!fb0Var.U) {
                            int selectedIndex = fb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(fb0Var.w);
                                Vibrator vibrator = (Vibrator) fb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.a9 a9Var = fb0Var.n;
                                if (a9Var != null && a9Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(fb0Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    i11 = fb0Var.a;
                                    if (i11 != 0) {
                                        org.telegram.ui.ActionBar.e2 e2Var = fb0Var.T;
                                        if (e2Var != null) {
                                            e2Var.dismiss();
                                        }
                                        fb0Var.U = true;
                                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(fb0Var.getParentActivity(), 3, null);
                                        fb0Var.T = e2Var2;
                                        e2Var2.r(500L);
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
                                        boolean z15 = cb0Var2 != null && cb0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z15;
                                        if (z15) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = fb0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = fb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
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
                                                                        fb0Var3.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var3 = fb0Var3.T;
                                                                        if (e2Var3 != null) {
                                                                            e2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.g5.t0(fb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var3.S;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        fb0 fb0Var4 = fb0Var2;
                                                                        fb0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var4 = fb0Var4.T;
                                                                        if (e2Var4 != null) {
                                                                            e2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.g5.t0(fb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var4.S;
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
                                                                        fb0Var32.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var3 = fb0Var32.T;
                                                                        if (e2Var3 != null) {
                                                                            e2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.g5.t0(fb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var32.S;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        fb0 fb0Var4 = fb0Var3;
                                                                        fb0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var4 = fb0Var4.T;
                                                                        if (e2Var4 != null) {
                                                                            e2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.g5.t0(fb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var4.S;
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
                                    } else if (i11 == 1) {
                                        org.telegram.ui.ActionBar.e2 e2Var3 = fb0Var.T;
                                        if (e2Var3 != null) {
                                            e2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = fb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = fb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (fb0Var.V != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (fb0Var.V != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = fb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z11 = z10;
                                            if (fb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z11 = true;
                                            }
                                            z12 = fb0Var.e.request_needed;
                                            cb0Var = fb0Var.f;
                                            if (z12 != (cb0Var == null && cb0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z16 = cb0Var != null && cb0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z16;
                                                if (z16) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z11 = true;
                                            }
                                            obj = fb0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(fb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                fb0Var.U = true;
                                                org.telegram.ui.ActionBar.e2 e2Var4 = new org.telegram.ui.ActionBar.e2(fb0Var.getParentActivity(), 3, null);
                                                fb0Var.T = e2Var4;
                                                e2Var4.r(500L);
                                                ConnectionsManager connectionsManager = fb0Var.getConnectionsManager();
                                                final boolean z17 = z14 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.wa0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (z17) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final fb0 fb0Var2 = fb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xa0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                fb0 fb0Var32 = fb0Var2;
                                                                                fb0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var32 = fb0Var32.T;
                                                                                if (e2Var32 != null) {
                                                                                    e2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(fb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    eb0 eb0Var = fb0Var32.S;
                                                                                    if (eb0Var != null) {
                                                                                        eb0Var.c(tLObject);
                                                                                    }
                                                                                    fb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                fb0 fb0Var4 = fb0Var2;
                                                                                fb0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var42 = fb0Var4.T;
                                                                                if (e2Var42 != null) {
                                                                                    e2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(fb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    eb0 eb0Var2 = fb0Var4.S;
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
                                                                                fb0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var32 = fb0Var32.T;
                                                                                if (e2Var32 != null) {
                                                                                    e2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(fb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    eb0 eb0Var = fb0Var32.S;
                                                                                    if (eb0Var != null) {
                                                                                        eb0Var.c(tLObject);
                                                                                    }
                                                                                    fb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                fb0 fb0Var4 = fb0Var3;
                                                                                fb0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var42 = fb0Var4.T;
                                                                                if (e2Var42 != null) {
                                                                                    e2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(fb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        fb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    eb0 eb0Var2 = fb0Var4.S;
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
                                            z11 = z10;
                                            if (fb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z11 = true;
                                            }
                                            z12 = fb0Var.e.request_needed;
                                            cb0Var = fb0Var.f;
                                            if (z12 != (cb0Var == null && cb0Var.e.h)) {
                                            }
                                            obj = fb0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(fb0Var.e.title, obj)) {
                                            }
                                            if (!z13) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i11 = fb0Var.a;
                                if (i11 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    fb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(fb0Var.F);
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((wb0) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                ig0 ig0Var = (ig0) obj2;
                if (i10 != 1) {
                    if (i10 == -1 && ig0Var.onBackPressed(true)) {
                        ig0Var.finishFragment();
                        break;
                    }
                } else {
                    ig0Var.u1();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((lg0) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((lh0) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((mh0) obj2).finishFragment();
                    break;
                }
                break;
            case 14:
                xi0 xi0Var = (xi0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", xi0Var.b);
                        xi0Var.presentFragment(new y91(bundle));
                        break;
                    }
                } else {
                    xi0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.r2) ((zj0) obj2)).actionBar;
                    kVar.g(true);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                fq0 fq0Var = (fq0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (fq0Var.c != null && !fq0Var.f) {
                            dq0 dq0Var = fq0Var.d;
                            float f7 = dq0Var.f - dq0Var.x;
                            float f10 = dq0Var.v;
                            float f11 = f7 / f10;
                            float f12 = (dq0Var.h - dq0Var.y) / dq0Var.w;
                            float f13 = dq0Var.d / f10;
                            float f14 = dq0Var.e / f10;
                            fq0 fq0Var2 = dq0Var.H;
                            int width = (int) (f11 * fq0Var2.a.getWidth());
                            int height = (int) (f12 * fq0Var2.a.getHeight());
                            int width2 = (int) (f13 * fq0Var2.a.getWidth());
                            int width3 = (int) (f14 * fq0Var2.a.getWidth());
                            int i15 = width < 0 ? 0 : width;
                            int i16 = height < 0 ? 0 : height;
                            if (i15 + width2 > fq0Var2.a.getWidth()) {
                                width2 = fq0Var2.a.getWidth() - i15;
                            }
                            int i17 = width2;
                            if (i16 + width3 > fq0Var2.a.getHeight()) {
                                width3 = fq0Var2.a.getHeight() - i16;
                            }
                            int i18 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(fq0Var2.a, i15, i16, i17, i18, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(fq0Var2.a, i15, i16, i17, i18, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == fq0Var.a) {
                                fq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.g50) fq0Var.c).r(false, bitmap, null);
                            fq0Var.f = true;
                        }
                        fq0Var.finishFragment();
                        break;
                    }
                } else {
                    fq0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                tq0 tq0Var = (tq0) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sq0 sq0Var = tq0Var.s0;
                            if (sq0Var != null) {
                                sq0Var.c();
                            }
                            tq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z18 = tq0Var.Y;
                        tq0Var.Y = !z18;
                        if (z18) {
                            tq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            tq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        tq0Var.K.C0();
                        tq0Var.M.h1(0, 0);
                        tq0Var.L.l();
                        break;
                    }
                } else {
                    tq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((xq0) obj2).finishFragment();
                    break;
                }
                break;
            case 23:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i19 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i20 = PopupNotificationActivity.b0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 24:
                hw0 hw0Var = (hw0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        hw0Var.Z();
                        break;
                    }
                } else if (hw0Var.onBackPressed(true)) {
                    hw0Var.finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        privacyControlActivity.A0();
                        break;
                    }
                } else if (privacyControlActivity.w0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((ux0) obj2).finishFragment();
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (i10 == -1) {
                    xz0 xz0Var = profileActivity.N;
                    if (xz0Var == null || !xz0Var.S(true)) {
                        if (!profileActivity.I0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", profileActivity.f1);
                            bundle2.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new ai.z0(bundle2));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
