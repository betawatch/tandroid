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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a20 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a20(Object obj, int i10) {
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
        ab0 ab0Var;
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
                    ((d20) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                r60 r60Var = (r60) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        r60Var.p0();
                        break;
                    }
                } else if (r60Var.g0(true)) {
                    r60Var.finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((x60) obj2).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((z60) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((f70) obj2).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((i70) obj2).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((w70) obj2).finishFragment();
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
                final db0 db0Var = (db0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        long j11 = db0Var.b;
                        ArrayList arrayList = db0Var.Q;
                        ArrayList arrayList2 = db0Var.O;
                        if (!db0Var.U) {
                            int selectedIndex = db0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(db0Var.w);
                                Vibrator vibrator = (Vibrator) db0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.a9 a9Var = db0Var.n;
                                if (a9Var != null && a9Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(db0Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    i11 = db0Var.a;
                                    if (i11 != 0) {
                                        org.telegram.ui.ActionBar.e2 e2Var = db0Var.T;
                                        if (e2Var != null) {
                                            e2Var.dismiss();
                                        }
                                        db0Var.U = true;
                                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(db0Var.getParentActivity(), 3, null);
                                        db0Var.T = e2Var2;
                                        e2Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = db0Var.getMessagesController().getInputPeer(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = db0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = db0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = db0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        ab0 ab0Var2 = db0Var.f;
                                        boolean z15 = ab0Var2 != null && ab0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z15;
                                        if (z15) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = db0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = db0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        db0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ua0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i13) {
                                                    case 0:
                                                        final int i14 = 0;
                                                        final db0 db0Var2 = db0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.va0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        db0 db0Var3 = db0Var2;
                                                                        db0Var3.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var3 = db0Var3.T;
                                                                        if (e2Var3 != null) {
                                                                            e2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.g5.t0(db0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            cb0 cb0Var = db0Var3.S;
                                                                            if (cb0Var != null) {
                                                                                cb0Var.c(tLObject);
                                                                            }
                                                                            db0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        db0 db0Var4 = db0Var2;
                                                                        db0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var4 = db0Var4.T;
                                                                        if (e2Var4 != null) {
                                                                            e2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.g5.t0(db0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                db0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            cb0 cb0Var2 = db0Var4.S;
                                                                            if (cb0Var2 != null) {
                                                                                cb0Var2.b(db0Var4.e, tLObject2);
                                                                            }
                                                                            db0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i15 = 1;
                                                        final db0 db0Var3 = db0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.va0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        db0 db0Var32 = db0Var3;
                                                                        db0Var32.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var3 = db0Var32.T;
                                                                        if (e2Var3 != null) {
                                                                            e2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.g5.t0(db0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            cb0 cb0Var = db0Var32.S;
                                                                            if (cb0Var != null) {
                                                                                cb0Var.c(tLObject);
                                                                            }
                                                                            db0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        db0 db0Var4 = db0Var3;
                                                                        db0Var4.U = false;
                                                                        org.telegram.ui.ActionBar.e2 e2Var4 = db0Var4.T;
                                                                        if (e2Var4 != null) {
                                                                            e2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.g5.t0(db0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                db0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            cb0 cb0Var2 = db0Var4.S;
                                                                            if (cb0Var2 != null) {
                                                                                cb0Var2.b(db0Var4.e, tLObject2);
                                                                            }
                                                                            db0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.e2 e2Var3 = db0Var.T;
                                        if (e2Var3 != null) {
                                            e2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = db0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = db0Var.getMessagesController().getInputPeer(-j11);
                                        int selectedIndex4 = db0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (db0Var.V != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = db0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (db0Var.V != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = db0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z11 = z10;
                                            if (db0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z11 = true;
                                            }
                                            z12 = db0Var.e.request_needed;
                                            ab0Var = db0Var.f;
                                            if (z12 != (ab0Var == null && ab0Var.e.h)) {
                                                int i14 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i14 | 8;
                                                boolean z16 = ab0Var != null && ab0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z16;
                                                if (z16) {
                                                    tL_messages_editExportedChatInvite.flags = i14 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z11 = true;
                                            }
                                            obj = db0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(db0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                db0Var.U = true;
                                                org.telegram.ui.ActionBar.e2 e2Var4 = new org.telegram.ui.ActionBar.e2(db0Var.getParentActivity(), 3, null);
                                                db0Var.T = e2Var4;
                                                e2Var4.r(500L);
                                                ConnectionsManager connectionsManager = db0Var.getConnectionsManager();
                                                final boolean z17 = z14 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ua0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (z17) {
                                                            case 0:
                                                                final int i142 = 0;
                                                                final db0 db0Var2 = db0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.va0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i142) {
                                                                            case 0:
                                                                                db0 db0Var32 = db0Var2;
                                                                                db0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var32 = db0Var32.T;
                                                                                if (e2Var32 != null) {
                                                                                    e2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(db0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    cb0 cb0Var = db0Var32.S;
                                                                                    if (cb0Var != null) {
                                                                                        cb0Var.c(tLObject);
                                                                                    }
                                                                                    db0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                db0 db0Var4 = db0Var2;
                                                                                db0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var42 = db0Var4.T;
                                                                                if (e2Var42 != null) {
                                                                                    e2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(db0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        db0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    cb0 cb0Var2 = db0Var4.S;
                                                                                    if (cb0Var2 != null) {
                                                                                        cb0Var2.b(db0Var4.e, tLObject2);
                                                                                    }
                                                                                    db0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i15 = 1;
                                                                final db0 db0Var3 = db0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.va0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i15) {
                                                                            case 0:
                                                                                db0 db0Var32 = db0Var3;
                                                                                db0Var32.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var32 = db0Var32.T;
                                                                                if (e2Var32 != null) {
                                                                                    e2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(db0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    cb0 cb0Var = db0Var32.S;
                                                                                    if (cb0Var != null) {
                                                                                        cb0Var.c(tLObject);
                                                                                    }
                                                                                    db0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                db0 db0Var4 = db0Var3;
                                                                                db0Var4.U = false;
                                                                                org.telegram.ui.ActionBar.e2 e2Var42 = db0Var4.T;
                                                                                if (e2Var42 != null) {
                                                                                    e2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.g5.t0(db0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        db0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    cb0 cb0Var2 = db0Var4.S;
                                                                                    if (cb0Var2 != null) {
                                                                                        cb0Var2.b(db0Var4.e, tLObject2);
                                                                                    }
                                                                                    db0Var4.finishFragment();
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
                                                db0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z11 = z10;
                                            if (db0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z11 = true;
                                            }
                                            z12 = db0Var.e.request_needed;
                                            ab0Var = db0Var.f;
                                            if (z12 != (ab0Var == null && ab0Var.e.h)) {
                                            }
                                            obj = db0Var.K.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(db0Var.e.title, obj)) {
                                            }
                                            if (!z13) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i11 = db0Var.a;
                                if (i11 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    db0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(db0Var.F);
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((tb0) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                gg0 gg0Var = (gg0) obj2;
                if (i10 != 1) {
                    if (i10 == -1 && gg0Var.onBackPressed(true)) {
                        gg0Var.finishFragment();
                        break;
                    }
                } else {
                    gg0Var.u1();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((jg0) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((jh0) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((kh0) obj2).finishFragment();
                    break;
                }
                break;
            case 14:
                vi0 vi0Var = (vi0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", vi0Var.b);
                        vi0Var.presentFragment(new w91(bundle));
                        break;
                    }
                } else {
                    vi0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.r2) ((xj0) obj2)).actionBar;
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
                dq0 dq0Var = (dq0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (dq0Var.c != null && !dq0Var.f) {
                            bq0 bq0Var = dq0Var.d;
                            float f7 = bq0Var.f - bq0Var.x;
                            float f10 = bq0Var.v;
                            float f11 = f7 / f10;
                            float f12 = (bq0Var.h - bq0Var.y) / bq0Var.w;
                            float f13 = bq0Var.d / f10;
                            float f14 = bq0Var.e / f10;
                            dq0 dq0Var2 = bq0Var.H;
                            int width = (int) (f11 * dq0Var2.a.getWidth());
                            int height = (int) (f12 * dq0Var2.a.getHeight());
                            int width2 = (int) (f13 * dq0Var2.a.getWidth());
                            int width3 = (int) (f14 * dq0Var2.a.getWidth());
                            int i15 = width < 0 ? 0 : width;
                            int i16 = height < 0 ? 0 : height;
                            if (i15 + width2 > dq0Var2.a.getWidth()) {
                                width2 = dq0Var2.a.getWidth() - i15;
                            }
                            int i17 = width2;
                            if (i16 + width3 > dq0Var2.a.getHeight()) {
                                width3 = dq0Var2.a.getHeight() - i16;
                            }
                            int i18 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(dq0Var2.a, i15, i16, i17, i18, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(dq0Var2.a, i15, i16, i17, i18, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == dq0Var.a) {
                                dq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.g50) dq0Var.c).r(false, bitmap, null);
                            dq0Var.f = true;
                        }
                        dq0Var.finishFragment();
                        break;
                    }
                } else {
                    dq0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                rq0 rq0Var = (rq0) obj2;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            qq0 qq0Var = rq0Var.s0;
                            if (qq0Var != null) {
                                qq0Var.c();
                            }
                            rq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z18 = rq0Var.Y;
                        rq0Var.Y = !z18;
                        if (z18) {
                            rq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            rq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        rq0Var.K.C0();
                        rq0Var.M.h1(0, 0);
                        rq0Var.L.l();
                        break;
                    }
                } else {
                    rq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((vq0) obj2).finishFragment();
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
                fw0 fw0Var = (fw0) obj2;
                if (i10 != -1) {
                    if (i10 == 1) {
                        fw0Var.Z();
                        break;
                    }
                } else if (fw0Var.onBackPressed(true)) {
                    fw0Var.finishFragment();
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
                    ((sx0) obj2).finishFragment();
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (i10 == -1) {
                    vz0 vz0Var = profileActivity.N;
                    if (vz0Var == null || !vz0Var.S(true)) {
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
