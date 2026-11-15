package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lx extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lx(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x043e  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        long j3;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        f90 f90Var;
        String obj;
        boolean z13;
        Bitmap bitmap;
        int i11 = this.a;
        final int i12 = 0;
        boolean z14 = true;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                if (i7 == -1) {
                    ((ox) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                hy hyVar = (hy) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        hyVar.h0();
                        break;
                    }
                } else if (hyVar.b0(true)) {
                    hyVar.finishFragment();
                    break;
                }
                break;
            case 2:
                hz hzVar = (hz) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        hzVar.w0();
                        break;
                    }
                } else if (hzVar.n0(true)) {
                    hzVar.finishFragment();
                    break;
                }
                break;
            case 3:
                if (i7 == -1) {
                    ((FiltersSetupActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i7 == -1) {
                    ((p00) obj2).finishFragment();
                    break;
                }
                break;
            case 5:
                w40 w40Var = (w40) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        w40Var.t0();
                        break;
                    }
                } else if (w40Var.k0(true)) {
                    w40Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((c50) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((e50) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((l50) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((o50) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((y50) obj2).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i7 == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                final i90 i90Var = (i90) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        long j10 = i90Var.b;
                        ArrayList arrayList = i90Var.R;
                        ArrayList arrayList2 = i90Var.P;
                        if (!i90Var.V) {
                            int selectedIndex = i90Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                org.telegram.messenger.g0.E3(i90Var.x);
                                Vibrator vibrator = (Vibrator) i90Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.q8 q8Var = i90Var.n;
                                if (q8Var != null && q8Var.e.h) {
                                    try {
                                        j3 = Long.parseLong(i90Var.r.d.getText().toString());
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    i10 = i90Var.a;
                                    if (i10 != 0) {
                                        org.telegram.ui.ActionBar.t1 t1Var = i90Var.U;
                                        if (t1Var != null) {
                                            t1Var.dismiss();
                                        }
                                        i90Var.V = true;
                                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, i90Var.getParentActivity(), null);
                                        i90Var.U = t1Var2;
                                        t1Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = i90Var.getMessagesController().j1(-j10);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = i90Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = i90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = i90Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        f90 f90Var2 = i90Var.f;
                                        boolean z15 = f90Var2 != null && f90Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z15;
                                        if (z15) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = i90Var.L.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j3 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = i90Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.ns.X4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j3;
                                        }
                                        i90Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.y80
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i12) {
                                                    case 0:
                                                        final int i13 = 0;
                                                        final i90 i90Var2 = i90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.z80
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i13) {
                                                                    case 0:
                                                                        i90 i90Var3 = i90Var2;
                                                                        i90Var3.V = false;
                                                                        org.telegram.ui.ActionBar.t1 t1Var3 = i90Var3.U;
                                                                        if (t1Var3 != null) {
                                                                            t1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.t4.r0(i90Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            h90 h90Var = i90Var3.T;
                                                                            if (h90Var != null) {
                                                                                h90Var.c(tLObject);
                                                                            }
                                                                            i90Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        i90 i90Var4 = i90Var2;
                                                                        i90Var4.V = false;
                                                                        org.telegram.ui.ActionBar.t1 t1Var4 = i90Var4.U;
                                                                        if (t1Var4 != null) {
                                                                            t1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.t4.r0(i90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                i90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            h90 h90Var2 = i90Var4.T;
                                                                            if (h90Var2 != null) {
                                                                                h90Var2.b(i90Var4.e, tLObject2);
                                                                            }
                                                                            i90Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i14 = 1;
                                                        final i90 i90Var3 = i90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.z80
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        i90 i90Var32 = i90Var3;
                                                                        i90Var32.V = false;
                                                                        org.telegram.ui.ActionBar.t1 t1Var3 = i90Var32.U;
                                                                        if (t1Var3 != null) {
                                                                            t1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.t4.r0(i90Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            h90 h90Var = i90Var32.T;
                                                                            if (h90Var != null) {
                                                                                h90Var.c(tLObject);
                                                                            }
                                                                            i90Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        i90 i90Var4 = i90Var3;
                                                                        i90Var4.V = false;
                                                                        org.telegram.ui.ActionBar.t1 t1Var4 = i90Var4.U;
                                                                        if (t1Var4 != null) {
                                                                            t1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.t4.r0(i90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                i90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            h90 h90Var2 = i90Var4.T;
                                                                            if (h90Var2 != null) {
                                                                                h90Var2.b(i90Var4.e, tLObject2);
                                                                            }
                                                                            i90Var4.finishFragment();
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
                                    } else if (i10 == 1) {
                                        org.telegram.ui.ActionBar.t1 t1Var3 = i90Var.U;
                                        if (t1Var3 != null) {
                                            t1Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = i90Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = i90Var.getMessagesController().j1(-j10);
                                        int selectedIndex4 = i90Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (i90Var.W != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = i90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (i90Var.W != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = i90Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z11 = z10;
                                            if (i90Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z11 = true;
                                            }
                                            z12 = i90Var.e.request_needed;
                                            f90Var = i90Var.f;
                                            if (z12 != (f90Var == null && f90Var.e.h)) {
                                                int i13 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i13 | 8;
                                                boolean z16 = f90Var != null && f90Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z16;
                                                if (z16) {
                                                    tL_messages_editExportedChatInvite.flags = i13 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z11 = true;
                                            }
                                            obj = i90Var.L.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(i90Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                i90Var.V = true;
                                                org.telegram.ui.ActionBar.t1 t1Var4 = new org.telegram.ui.ActionBar.t1(3, i90Var.getParentActivity(), null);
                                                i90Var.U = t1Var4;
                                                t1Var4.r(500L);
                                                ConnectionsManager connectionsManager = i90Var.getConnectionsManager();
                                                final boolean z17 = z14 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.y80
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (z17) {
                                                            case 0:
                                                                final int i132 = 0;
                                                                final i90 i90Var2 = i90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.z80
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i132) {
                                                                            case 0:
                                                                                i90 i90Var32 = i90Var2;
                                                                                i90Var32.V = false;
                                                                                org.telegram.ui.ActionBar.t1 t1Var32 = i90Var32.U;
                                                                                if (t1Var32 != null) {
                                                                                    t1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.t4.r0(i90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    h90 h90Var = i90Var32.T;
                                                                                    if (h90Var != null) {
                                                                                        h90Var.c(tLObject);
                                                                                    }
                                                                                    i90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                i90 i90Var4 = i90Var2;
                                                                                i90Var4.V = false;
                                                                                org.telegram.ui.ActionBar.t1 t1Var42 = i90Var4.U;
                                                                                if (t1Var42 != null) {
                                                                                    t1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.t4.r0(i90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        i90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    h90 h90Var2 = i90Var4.T;
                                                                                    if (h90Var2 != null) {
                                                                                        h90Var2.b(i90Var4.e, tLObject2);
                                                                                    }
                                                                                    i90Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i14 = 1;
                                                                final i90 i90Var3 = i90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.z80
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i14) {
                                                                            case 0:
                                                                                i90 i90Var32 = i90Var3;
                                                                                i90Var32.V = false;
                                                                                org.telegram.ui.ActionBar.t1 t1Var32 = i90Var32.U;
                                                                                if (t1Var32 != null) {
                                                                                    t1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.t4.r0(i90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    h90 h90Var = i90Var32.T;
                                                                                    if (h90Var != null) {
                                                                                        h90Var.c(tLObject);
                                                                                    }
                                                                                    i90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                i90 i90Var4 = i90Var3;
                                                                                i90Var4.V = false;
                                                                                org.telegram.ui.ActionBar.t1 t1Var42 = i90Var4.U;
                                                                                if (t1Var42 != null) {
                                                                                    t1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.t4.r0(i90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        i90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    h90 h90Var2 = i90Var4.T;
                                                                                    if (h90Var2 != null) {
                                                                                        h90Var2.b(i90Var4.e, tLObject2);
                                                                                    }
                                                                                    i90Var4.finishFragment();
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
                                                i90Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z11 = z10;
                                            if (i90Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z11 = true;
                                            }
                                            z12 = i90Var.e.request_needed;
                                            f90Var = i90Var.f;
                                            if (z12 != (f90Var == null && f90Var.e.h)) {
                                            }
                                            obj = i90Var.L.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(i90Var.e.title, obj)) {
                                            }
                                            if (!z13) {
                                            }
                                        }
                                    }
                                }
                                j3 = 0;
                                i10 = i90Var.a;
                                if (i10 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    i90Var.finishFragment();
                    org.telegram.messenger.g0.v1(i90Var.G);
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((x90) obj2).finishFragment();
                    break;
                }
                break;
            case 14:
                ce0 ce0Var = (ce0) obj2;
                if (i7 != 1) {
                    if (i7 == -1 && ce0Var.onBackPressed(true)) {
                        ce0Var.finishFragment();
                        break;
                    }
                } else {
                    ce0Var.H1();
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((ee0) obj2).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((cf0) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((bi.t6) obj2).finishFragment();
                    break;
                }
                break;
            case 18:
                jg0 jg0Var = (jg0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", jg0Var.b);
                        jg0Var.presentFragment(new z41(bundle));
                        break;
                    }
                } else {
                    jg0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i7 == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i7 == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 23:
                nm0 nm0Var = (nm0) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            nm0.Z(nm0Var, null);
                            break;
                        }
                    } else if (nm0Var.W != null) {
                        nm0Var.finishFragment(false);
                        nm0Var.W.s0();
                        break;
                    }
                } else {
                    nm0Var.finishFragment();
                    break;
                }
                break;
            case 24:
                qm0 qm0Var = (qm0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        if (qm0Var.c != null && !qm0Var.f) {
                            om0 om0Var = qm0Var.d;
                            float f10 = om0Var.f - om0Var.y;
                            float f11 = om0Var.w;
                            float f12 = f10 / f11;
                            float f13 = (om0Var.h - om0Var.E) / om0Var.x;
                            float f14 = om0Var.d / f11;
                            float f15 = om0Var.e / f11;
                            qm0 qm0Var2 = om0Var.I;
                            int width = (int) (f12 * qm0Var2.a.getWidth());
                            int height = (int) (f13 * qm0Var2.a.getHeight());
                            int width2 = (int) (f14 * qm0Var2.a.getWidth());
                            int width3 = (int) (f15 * qm0Var2.a.getWidth());
                            int i14 = width < 0 ? 0 : width;
                            int i15 = height < 0 ? 0 : height;
                            if (i14 + width2 > qm0Var2.a.getWidth()) {
                                width2 = qm0Var2.a.getWidth() - i14;
                            }
                            int i16 = width2;
                            if (i15 + width3 > qm0Var2.a.getHeight()) {
                                width3 = qm0Var2.a.getHeight() - i15;
                            }
                            int i17 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(qm0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(qm0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    org.telegram.messenger.a8.g(th3, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == qm0Var.a) {
                                qm0Var.e = true;
                            }
                            ((org.telegram.ui.Components.m30) qm0Var.c).r(false, bitmap, null);
                            qm0Var.f = true;
                        }
                        qm0Var.finishFragment();
                        break;
                    }
                } else {
                    qm0Var.finishFragment();
                    break;
                }
                break;
            case 25:
                ym0 ym0Var = (ym0) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            xm0 xm0Var = ym0Var.t0;
                            if (xm0Var != null) {
                                xm0Var.d0();
                            }
                            ym0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z18 = ym0Var.Z;
                        ym0Var.Z = !z18;
                        if (z18) {
                            ym0Var.L.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
                        } else {
                            ym0Var.L.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
                        }
                        ym0Var.L.C0();
                        ym0Var.N.h1(0, 0);
                        ym0Var.M.f();
                        break;
                    }
                } else {
                    ym0Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i7 == -1) {
                    ((bn0) obj2).finishFragment();
                    break;
                }
                break;
            case 27:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i7 != -1) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            int i18 = PopupNotificationActivity.c0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i19 = PopupNotificationActivity.c0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 28:
                es0 es0Var = (es0) obj2;
                if (i7 != -1) {
                    if (i7 == 1) {
                        es0Var.d0();
                        break;
                    }
                } else if (es0Var.onBackPressed(true)) {
                    es0Var.finishFragment();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
        }
    }
}
