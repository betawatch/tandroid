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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hx extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hx(Object obj, int i3) {
        this.a = i3;
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
    public final void b(int i3) {
        long j10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        b90 b90Var;
        String obj;
        boolean z13;
        Bitmap bitmap;
        int i11 = this.a;
        final int i12 = 0;
        boolean z14 = true;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                if (i3 == -1) {
                    ((kx) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                cy cyVar = (cy) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        cyVar.h0();
                        break;
                    }
                } else if (cyVar.b0(true)) {
                    cyVar.finishFragment();
                    break;
                }
                break;
            case 2:
                ez ezVar = (ez) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        ezVar.w0();
                        break;
                    }
                } else if (ezVar.n0(true)) {
                    ezVar.finishFragment();
                    break;
                }
                break;
            case 3:
                if (i3 == -1) {
                    ((FiltersSetupActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i3 == -1) {
                    ((l00) obj2).finishFragment();
                    break;
                }
                break;
            case 5:
                r40 r40Var = (r40) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        r40Var.t0();
                        break;
                    }
                } else if (r40Var.k0(true)) {
                    r40Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i3 == -1) {
                    ((y40) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i3 == -1) {
                    ((a50) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i3 == -1) {
                    ((g50) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i3 == -1) {
                    ((j50) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i3 == -1) {
                    ((t50) obj2).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i3 == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                final e90 e90Var = (e90) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        long j11 = e90Var.b;
                        ArrayList arrayList = e90Var.R;
                        ArrayList arrayList2 = e90Var.P;
                        if (!e90Var.V) {
                            int selectedIndex = e90Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                org.telegram.messenger.g0.F3(e90Var.x);
                                Vibrator vibrator = (Vibrator) e90Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.q8 q8Var = e90Var.n;
                                if (q8Var != null && q8Var.e.h) {
                                    try {
                                        j10 = Long.parseLong(e90Var.r.d.getText().toString());
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    i10 = e90Var.a;
                                    if (i10 != 0) {
                                        org.telegram.ui.ActionBar.s1 s1Var = e90Var.U;
                                        if (s1Var != null) {
                                            s1Var.dismiss();
                                        }
                                        e90Var.V = true;
                                        org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, e90Var.getParentActivity(), null);
                                        e90Var.U = s1Var2;
                                        s1Var2.r(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = e90Var.getMessagesController().j1(-j11);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = e90Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = e90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = e90Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        b90 b90Var2 = e90Var.f;
                                        boolean z15 = b90Var2 != null && b90Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z15;
                                        if (z15) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = e90Var.L.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j10 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = e90Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.hs.X4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                        }
                                        e90Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.v80
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i12) {
                                                    case 0:
                                                        final int i13 = 0;
                                                        final e90 e90Var2 = e90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.w80
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i13) {
                                                                    case 0:
                                                                        e90 e90Var3 = e90Var2;
                                                                        e90Var3.V = false;
                                                                        org.telegram.ui.ActionBar.s1 s1Var3 = e90Var3.U;
                                                                        if (s1Var3 != null) {
                                                                            s1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.t4.t0(e90Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            d90 d90Var = e90Var3.T;
                                                                            if (d90Var != null) {
                                                                                d90Var.c(tLObject);
                                                                            }
                                                                            e90Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        e90 e90Var4 = e90Var2;
                                                                        e90Var4.V = false;
                                                                        org.telegram.ui.ActionBar.s1 s1Var4 = e90Var4.U;
                                                                        if (s1Var4 != null) {
                                                                            s1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.t4.t0(e90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                e90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            d90 d90Var2 = e90Var4.T;
                                                                            if (d90Var2 != null) {
                                                                                d90Var2.b(e90Var4.e, tLObject2);
                                                                            }
                                                                            e90Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i14 = 1;
                                                        final e90 e90Var3 = e90Var;
                                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.w80
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i14) {
                                                                    case 0:
                                                                        e90 e90Var32 = e90Var3;
                                                                        e90Var32.V = false;
                                                                        org.telegram.ui.ActionBar.s1 s1Var3 = e90Var32.U;
                                                                        if (s1Var3 != null) {
                                                                            s1Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.t4.t0(e90Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            d90 d90Var = e90Var32.T;
                                                                            if (d90Var != null) {
                                                                                d90Var.c(tLObject);
                                                                            }
                                                                            e90Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        e90 e90Var4 = e90Var3;
                                                                        e90Var4.V = false;
                                                                        org.telegram.ui.ActionBar.s1 s1Var4 = e90Var4.U;
                                                                        if (s1Var4 != null) {
                                                                            s1Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.t4.t0(e90Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                e90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            d90 d90Var2 = e90Var4.T;
                                                                            if (d90Var2 != null) {
                                                                                d90Var2.b(e90Var4.e, tLObject2);
                                                                            }
                                                                            e90Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.s1 s1Var3 = e90Var.U;
                                        if (s1Var3 != null) {
                                            s1Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = e90Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = e90Var.getMessagesController().j1(-j11);
                                        int selectedIndex4 = e90Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (e90Var.W != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = e90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (e90Var.W != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = e90Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            z11 = z10;
                                            if (e90Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z11 = true;
                                            }
                                            z12 = e90Var.e.request_needed;
                                            b90Var = e90Var.f;
                                            if (z12 != (b90Var == null && b90Var.e.h)) {
                                                int i13 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i13 | 8;
                                                boolean z16 = b90Var != null && b90Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z16;
                                                if (z16) {
                                                    tL_messages_editExportedChatInvite.flags = i13 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z11 = true;
                                            }
                                            obj = e90Var.L.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(e90Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                e90Var.V = true;
                                                org.telegram.ui.ActionBar.s1 s1Var4 = new org.telegram.ui.ActionBar.s1(3, e90Var.getParentActivity(), null);
                                                e90Var.U = s1Var4;
                                                s1Var4.r(500L);
                                                ConnectionsManager connectionsManager = e90Var.getConnectionsManager();
                                                final boolean z17 = z14 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.v80
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (z17) {
                                                            case 0:
                                                                final int i132 = 0;
                                                                final e90 e90Var2 = e90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.w80
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i132) {
                                                                            case 0:
                                                                                e90 e90Var32 = e90Var2;
                                                                                e90Var32.V = false;
                                                                                org.telegram.ui.ActionBar.s1 s1Var32 = e90Var32.U;
                                                                                if (s1Var32 != null) {
                                                                                    s1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.t4.t0(e90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    d90 d90Var = e90Var32.T;
                                                                                    if (d90Var != null) {
                                                                                        d90Var.c(tLObject);
                                                                                    }
                                                                                    e90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                e90 e90Var4 = e90Var2;
                                                                                e90Var4.V = false;
                                                                                org.telegram.ui.ActionBar.s1 s1Var42 = e90Var4.U;
                                                                                if (s1Var42 != null) {
                                                                                    s1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.t4.t0(e90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        e90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    d90 d90Var2 = e90Var4.T;
                                                                                    if (d90Var2 != null) {
                                                                                        d90Var2.b(e90Var4.e, tLObject2);
                                                                                    }
                                                                                    e90Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i14 = 1;
                                                                final e90 e90Var3 = e90Var;
                                                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.w80
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i14) {
                                                                            case 0:
                                                                                e90 e90Var32 = e90Var3;
                                                                                e90Var32.V = false;
                                                                                org.telegram.ui.ActionBar.s1 s1Var32 = e90Var32.U;
                                                                                if (s1Var32 != null) {
                                                                                    s1Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.t4.t0(e90Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    d90 d90Var = e90Var32.T;
                                                                                    if (d90Var != null) {
                                                                                        d90Var.c(tLObject);
                                                                                    }
                                                                                    e90Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                e90 e90Var4 = e90Var3;
                                                                                e90Var4.V = false;
                                                                                org.telegram.ui.ActionBar.s1 s1Var42 = e90Var4.U;
                                                                                if (s1Var42 != null) {
                                                                                    s1Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.t4.t0(e90Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        e90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    d90 d90Var2 = e90Var4.T;
                                                                                    if (d90Var2 != null) {
                                                                                        d90Var2.b(e90Var4.e, tLObject2);
                                                                                    }
                                                                                    e90Var4.finishFragment();
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
                                                e90Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            z11 = z10;
                                            if (e90Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z11 = true;
                                            }
                                            z12 = e90Var.e.request_needed;
                                            b90Var = e90Var.f;
                                            if (z12 != (b90Var == null && b90Var.e.h)) {
                                            }
                                            obj = e90Var.L.getText().toString();
                                            z13 = z11;
                                            if (!TextUtils.equals(e90Var.e.title, obj)) {
                                            }
                                            if (!z13) {
                                            }
                                        }
                                    }
                                }
                                j10 = 0;
                                i10 = e90Var.a;
                                if (i10 != 0) {
                                }
                            }
                        }
                    }
                } else {
                    e90Var.finishFragment();
                    org.telegram.messenger.g0.v1(e90Var.G);
                    break;
                }
                break;
            case 13:
                if (i3 == -1) {
                    ((t90) obj2).finishFragment();
                    break;
                }
                break;
            case 14:
                xd0 xd0Var = (xd0) obj2;
                if (i3 != 1) {
                    if (i3 == -1 && xd0Var.onBackPressed(true)) {
                        xd0Var.finishFragment();
                        break;
                    }
                } else {
                    xd0Var.y1();
                    break;
                }
                break;
            case 15:
                if (i3 == -1) {
                    ((zd0) obj2).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i3 == -1) {
                    ((xe0) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i3 == -1) {
                    ((ai.c7) obj2).finishFragment();
                    break;
                }
                break;
            case 18:
                dg0 dg0Var = (dg0) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", dg0Var.b);
                        dg0Var.presentFragment(new r41(bundle));
                        break;
                    }
                } else {
                    dg0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i3 == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i3 == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i3 == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i3 == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 23:
                hm0 hm0Var = (hm0) obj2;
                if (i3 != -1) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            hm0.Z(hm0Var, null);
                            break;
                        }
                    } else if (hm0Var.W != null) {
                        hm0Var.finishFragment(false);
                        hm0Var.W.m();
                        break;
                    }
                } else {
                    hm0Var.finishFragment();
                    break;
                }
                break;
            case 24:
                km0 km0Var = (km0) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        if (km0Var.c != null && !km0Var.f) {
                            im0 im0Var = km0Var.d;
                            float f10 = im0Var.f - im0Var.y;
                            float f11 = im0Var.w;
                            float f12 = f10 / f11;
                            float f13 = (im0Var.h - im0Var.E) / im0Var.x;
                            float f14 = im0Var.d / f11;
                            float f15 = im0Var.e / f11;
                            km0 km0Var2 = im0Var.I;
                            int width = (int) (f12 * km0Var2.a.getWidth());
                            int height = (int) (f13 * km0Var2.a.getHeight());
                            int width2 = (int) (f14 * km0Var2.a.getWidth());
                            int width3 = (int) (f15 * km0Var2.a.getWidth());
                            int i14 = width < 0 ? 0 : width;
                            int i15 = height < 0 ? 0 : height;
                            if (i14 + width2 > km0Var2.a.getWidth()) {
                                width2 = km0Var2.a.getWidth() - i14;
                            }
                            int i16 = width2;
                            if (i15 + width3 > km0Var2.a.getHeight()) {
                                width3 = km0Var2.a.getHeight() - i15;
                            }
                            int i17 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(km0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(km0Var2.a, i14, i15, i16, i17, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    org.telegram.messenger.a8.g(th3, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == km0Var.a) {
                                km0Var.e = true;
                            }
                            ((org.telegram.ui.Components.f30) km0Var.c).r(false, bitmap, null);
                            km0Var.f = true;
                        }
                        km0Var.finishFragment();
                        break;
                    }
                } else {
                    km0Var.finishFragment();
                    break;
                }
                break;
            case 25:
                sm0 sm0Var = (sm0) obj2;
                if (i3 != -1) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            rm0 rm0Var = sm0Var.t0;
                            if (rm0Var != null) {
                                rm0Var.c0();
                            }
                            sm0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z18 = sm0Var.Z;
                        sm0Var.Z = !z18;
                        if (z18) {
                            sm0Var.L.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
                        } else {
                            sm0Var.L.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
                        }
                        sm0Var.L.C0();
                        sm0Var.N.h1(0, 0);
                        sm0Var.M.f();
                        break;
                    }
                } else {
                    sm0Var.finishFragment();
                    break;
                }
                break;
            case 26:
                if (i3 == -1) {
                    ((vm0) obj2).finishFragment();
                    break;
                }
                break;
            case 27:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i3 != -1) {
                    if (i3 != 1) {
                        if (i3 == 2) {
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
                xr0 xr0Var = (xr0) obj2;
                if (i3 != -1) {
                    if (i3 == 1) {
                        xr0Var.d0();
                        break;
                    }
                } else if (xr0Var.onBackPressed(true)) {
                    xr0Var.finishFragment();
                    break;
                }
                break;
            default:
                if (i3 == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
        }
    }
}
