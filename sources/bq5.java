// default package

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
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bq5 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bq5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04b9  */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        long j;
        boolean z;
        boolean z2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z3;
        boolean z4;
        p36 p36Var;
        String obj;
        boolean z5;
        Bitmap bitmap;
        Runnable runnable;
        byte b = this.a;
        final byte b2 = 0;
        boolean z6 = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((gq5) obj2).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 2:
                final s36 s36Var = (s36) obj2;
                if (i != -1) {
                    if (i == 1) {
                        long j2 = s36Var.b;
                        ArrayList arrayList = s36Var.R;
                        ArrayList arrayList2 = s36Var.P;
                        if (!s36Var.V) {
                            int selectedIndex = s36Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                gl.A3(s36Var.x);
                                Vibrator vibrator = (Vibrator) s36Var.x.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                ahb ahbVar = s36Var.n;
                                if (ahbVar != null && ahbVar.e.h) {
                                    try {
                                        j = Long.parseLong(s36Var.r.d.getText().toString());
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    z = s36Var.a;
                                    if (z) {
                                        hd hdVar = s36Var.U;
                                        if (hdVar != null) {
                                            hdVar.dismiss();
                                        }
                                        s36Var.V = true;
                                        hd hdVar2 = new hd(3, null, s36Var.getParentActivity());
                                        s36Var.U = hdVar2;
                                        hdVar2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = s36Var.getMessagesController().h1(-j2);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = s36Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = s36Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = s36Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        p36 p36Var2 = s36Var.f;
                                        boolean z7 = p36Var2 != null && p36Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z7;
                                        if (z7) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj3 = s36Var.L.getText().toString();
                                        tL_messages_exportChatInvite.title = obj3;
                                        if (!TextUtils.isEmpty(obj3)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = s36Var.getConnectionsManager().isTestBackend() ? kk7.W4 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j;
                                        }
                                        s36Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: j36
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                byte b3 = b2;
                                                final s36 s36Var2 = s36Var;
                                                switch (b3) {
                                                    case 0:
                                                        final byte b4 = 0;
                                                        gl.d3(new Runnable() { // from class: k36
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b5 = b4;
                                                                TLObject tLObject2 = tLObject;
                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                s36 s36Var3 = s36Var2;
                                                                switch (b5) {
                                                                    case 0:
                                                                        s36Var3.V = false;
                                                                        hd hdVar3 = s36Var3.U;
                                                                        if (hdVar3 != null) {
                                                                            hdVar3.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ij.r0(s36Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            r36 r36Var = s36Var3.T;
                                                                            if (r36Var != null) {
                                                                                r36Var.c(tLObject2);
                                                                            }
                                                                            s36Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        s36Var3.V = false;
                                                                        hd hdVar4 = s36Var3.U;
                                                                        if (hdVar4 != null) {
                                                                            hdVar4.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ij.r0(s36Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                s36Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            r36 r36Var2 = s36Var3.T;
                                                                            if (r36Var2 != null) {
                                                                                r36Var2.b(s36Var3.e, tLObject2);
                                                                            }
                                                                            s36Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final byte b5 = 1;
                                                        gl.d3(new Runnable() { // from class: k36
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b52 = b5;
                                                                TLObject tLObject2 = tLObject;
                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                s36 s36Var3 = s36Var2;
                                                                switch (b52) {
                                                                    case 0:
                                                                        s36Var3.V = false;
                                                                        hd hdVar3 = s36Var3.U;
                                                                        if (hdVar3 != null) {
                                                                            hdVar3.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ij.r0(s36Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            r36 r36Var = s36Var3.T;
                                                                            if (r36Var != null) {
                                                                                r36Var.c(tLObject2);
                                                                            }
                                                                            s36Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        s36Var3.V = false;
                                                                        hd hdVar4 = s36Var3.U;
                                                                        if (hdVar4 != null) {
                                                                            hdVar4.dismiss();
                                                                        }
                                                                        if (tL_error2 != null) {
                                                                            ij.r0(s36Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                s36Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            r36 r36Var2 = s36Var3.T;
                                                                            if (r36Var2 != null) {
                                                                                r36Var2.b(s36Var3.e, tLObject2);
                                                                            }
                                                                            s36Var3.finishFragment();
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
                                    } else if (z) {
                                        hd hdVar3 = s36Var.U;
                                        if (hdVar3 != null) {
                                            hdVar3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = s36Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = s36Var.getMessagesController().h1(-j2);
                                        int selectedIndex4 = s36Var.d.getSelectedIndex();
                                        int size = arrayList2.size();
                                        int i2 = s36Var.W;
                                        if (selectedIndex4 < size) {
                                            if (i2 != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = s36Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z2 = true;
                                            }
                                            z2 = false;
                                        } else {
                                            if (i2 != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z2 = true;
                                            }
                                            z2 = false;
                                        }
                                        int selectedIndex5 = s36Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            tL_chatInviteExported = s36Var.e;
                                            z3 = z2;
                                            if (tL_chatInviteExported.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z3 = true;
                                            }
                                            z4 = tL_chatInviteExported.request_needed;
                                            p36Var = s36Var.f;
                                            if (z4 != (p36Var == null && p36Var.e.h)) {
                                                int i3 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i3 | 8;
                                                boolean z8 = p36Var != null && p36Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z8;
                                                if (z8) {
                                                    tL_messages_editExportedChatInvite.flags = i3 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z3 = true;
                                            }
                                            obj = s36Var.L.getText().toString();
                                            z5 = z3;
                                            if (!TextUtils.equals(s36Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z5 = true;
                                            }
                                            if (!z5) {
                                                s36Var.V = true;
                                                hd hdVar4 = new hd(3, null, s36Var.getParentActivity());
                                                s36Var.U = hdVar4;
                                                hdVar4.q(500L);
                                                ConnectionsManager connectionsManager = s36Var.getConnectionsManager();
                                                final boolean z9 = z6 ? 1 : 0;
                                                connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: j36
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        byte b3 = z9;
                                                        final s36 s36Var2 = s36Var;
                                                        switch (b3) {
                                                            case 0:
                                                                final byte b4 = 0;
                                                                gl.d3(new Runnable() { // from class: k36
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        byte b52 = b4;
                                                                        TLObject tLObject2 = tLObject;
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        s36 s36Var3 = s36Var2;
                                                                        switch (b52) {
                                                                            case 0:
                                                                                s36Var3.V = false;
                                                                                hd hdVar32 = s36Var3.U;
                                                                                if (hdVar32 != null) {
                                                                                    hdVar32.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ij.r0(s36Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    r36 r36Var = s36Var3.T;
                                                                                    if (r36Var != null) {
                                                                                        r36Var.c(tLObject2);
                                                                                    }
                                                                                    s36Var3.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                s36Var3.V = false;
                                                                                hd hdVar42 = s36Var3.U;
                                                                                if (hdVar42 != null) {
                                                                                    hdVar42.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ij.r0(s36Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        s36Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    r36 r36Var2 = s36Var3.T;
                                                                                    if (r36Var2 != null) {
                                                                                        r36Var2.b(s36Var3.e, tLObject2);
                                                                                    }
                                                                                    s36Var3.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final byte b5 = 1;
                                                                gl.d3(new Runnable() { // from class: k36
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        byte b52 = b5;
                                                                        TLObject tLObject2 = tLObject;
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        s36 s36Var3 = s36Var2;
                                                                        switch (b52) {
                                                                            case 0:
                                                                                s36Var3.V = false;
                                                                                hd hdVar32 = s36Var3.U;
                                                                                if (hdVar32 != null) {
                                                                                    hdVar32.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ij.r0(s36Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    r36 r36Var = s36Var3.T;
                                                                                    if (r36Var != null) {
                                                                                        r36Var.c(tLObject2);
                                                                                    }
                                                                                    s36Var3.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                s36Var3.V = false;
                                                                                hd hdVar42 = s36Var3.U;
                                                                                if (hdVar42 != null) {
                                                                                    hdVar42.dismiss();
                                                                                }
                                                                                if (tL_error2 != null) {
                                                                                    ij.r0(s36Var3, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        s36Var3.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    r36 r36Var2 = s36Var3.T;
                                                                                    if (r36Var2 != null) {
                                                                                        r36Var2.b(s36Var3.e, tLObject2);
                                                                                    }
                                                                                    s36Var3.finishFragment();
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
                                                s36Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            tL_chatInviteExported = s36Var.e;
                                            z3 = z2;
                                            if (tL_chatInviteExported.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z3 = true;
                                            }
                                            z4 = tL_chatInviteExported.request_needed;
                                            p36Var = s36Var.f;
                                            if (z4 != (p36Var == null && p36Var.e.h)) {
                                            }
                                            obj = s36Var.L.getText().toString();
                                            z5 = z3;
                                            if (!TextUtils.equals(s36Var.e.title, obj)) {
                                            }
                                            if (!z5) {
                                            }
                                        }
                                    }
                                }
                                j = 0;
                                z = s36Var.a;
                                if (z) {
                                }
                            }
                        }
                    }
                } else {
                    s36Var.finishFragment();
                    gl.t1(s36Var.G);
                    break;
                }
                break;
            case 3:
                if (i == -1) {
                    ((m66) obj2).finishFragment();
                    break;
                }
                break;
            case 4:
                pa6 pa6Var = (pa6) obj2;
                if (i != -1) {
                    if (i == 1) {
                        pa6Var.a0();
                        break;
                    }
                } else if (pa6Var.onBackPressed(true)) {
                    pa6Var.finishFragment();
                    break;
                }
                break;
            case 5:
                mf6 mf6Var = (mf6) obj2;
                if (i != 1) {
                    if (i == -1 && mf6Var.onBackPressed(true)) {
                        mf6Var.finishFragment();
                        break;
                    }
                } else {
                    mf6Var.C1();
                    break;
                }
                break;
            case 6:
                if (i == -1) {
                    ((pf6) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i == -1) {
                    ((yh6) obj2).finishFragment();
                    break;
                }
                break;
            case 8:
                zj6 zj6Var = (zj6) obj2;
                if (i != -1) {
                    if (i == 10) {
                        yj6 yj6Var = zj6Var.S;
                        yj6Var.n1(yj6Var.getClosestTab(), false);
                        break;
                    }
                } else if (!zj6Var.S.E(true)) {
                    zj6Var.finishFragment();
                    break;
                }
                break;
            case 9:
                if (i == -1) {
                    ((hu0) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                s47 s47Var = (s47) obj2;
                if (i != -1) {
                    if (i == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", s47Var.b);
                        s47Var.presentFragment(new uxa(bundle));
                        break;
                    }
                } else {
                    s47Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                qq7 qq7Var = (qq7) obj2;
                if (i != -1) {
                    if (i == 1) {
                        qq7Var.h0();
                        break;
                    }
                } else if (qq7Var.onBackPressed(true)) {
                    qq7Var.finishFragment();
                    break;
                }
                break;
            case 14:
                if (i == -1) {
                    ((sq7) obj2).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 17:
                g48 g48Var = (g48) obj2;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            g48Var.Y(null);
                            break;
                        }
                    } else if (g48Var.W != null) {
                        g48Var.finishFragment(false);
                        g48Var.W.r();
                        break;
                    }
                } else {
                    g48Var.finishFragment();
                    break;
                }
                break;
            case 18:
                r48 r48Var = (r48) obj2;
                if (i != -1) {
                    if (i == 1) {
                        if (r48Var.c != null && !r48Var.f) {
                            q48 q48Var = r48Var.d;
                            float f = q48Var.f - q48Var.y;
                            float f2 = q48Var.w;
                            float f3 = f / f2;
                            float f4 = (q48Var.h - q48Var.E) / q48Var.x;
                            float f5 = q48Var.d / f2;
                            float f6 = q48Var.e / f2;
                            r48 r48Var2 = q48Var.I;
                            int width = (int) (f3 * r48Var2.a.getWidth());
                            int height = (int) (f4 * r48Var2.a.getHeight());
                            int width2 = (int) (f5 * r48Var2.a.getWidth());
                            int width3 = (int) (f6 * r48Var2.a.getWidth());
                            int i4 = width < 0 ? 0 : width;
                            int i5 = height < 0 ? 0 : height;
                            if (i4 + width2 > r48Var2.a.getWidth()) {
                                width2 = r48Var2.a.getWidth() - i4;
                            }
                            int i6 = width2;
                            if (i5 + width3 > r48Var2.a.getHeight()) {
                                width3 = r48Var2.a.getHeight() - i5;
                            }
                            int i7 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(r48Var2.a, i4, i5, i6, i7, (Matrix) null, false);
                            } catch (Throwable th) {
                                fa4.g(th, true);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(r48Var2.a, i4, i5, i6, i7, (Matrix) null, false);
                                } catch (Throwable th2) {
                                    fa4.g(th2, true);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == r48Var.a) {
                                r48Var.e = true;
                            }
                            r48Var.c.r(false, bitmap, null);
                            r48Var.f = true;
                        }
                        r48Var.finishFragment();
                        break;
                    }
                } else {
                    r48Var.finishFragment();
                    break;
                }
                break;
            case 19:
                u58 u58Var = (u58) obj2;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            s58 s58Var = u58Var.t0;
                            if (s58Var != null) {
                                s58Var.k();
                            }
                            u58Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = u58Var.Z;
                        u58Var.Z = !z10;
                        o39 o39Var = u58Var.L;
                        if (z10) {
                            o39Var.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(50.0f));
                        } else {
                            o39Var.setPadding(0, 0, 0, gl.L(48.0f));
                        }
                        u58Var.L.D0();
                        u58Var.N.g1(0, 0);
                        u58Var.M.f();
                        break;
                    }
                } else {
                    u58Var.finishFragment();
                    break;
                }
                break;
            case 20:
                if (i == -1) {
                    ((b68) obj2).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i == -1 && (runnable = ((v98) obj2).r) != null) {
                    gl.d3(runnable);
                    break;
                }
                break;
            case 22:
                if (i == -1) {
                    ((gf8) obj2).dismiss();
                    break;
                }
                break;
            case 23:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            int i8 = PopupNotificationActivity.c0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i9 = PopupNotificationActivity.c0;
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
                uf8 uf8Var = (uf8) obj2;
                if (i != -1) {
                    if (i == 1) {
                        uf8Var.c0();
                        break;
                    }
                } else if (uf8Var.onBackPressed(true)) {
                    uf8Var.finishFragment();
                    break;
                }
                break;
            case 25:
                if (i == -1) {
                    ((jh8) obj2).dismiss();
                    break;
                }
                break;
            case 26:
                if (i == -1) {
                    ((PremiumPreviewFragment) obj2).finishFragment();
                    break;
                }
                break;
            case 27:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                if (i != -1) {
                    if (i == 1) {
                        privacyControlActivity.I0();
                        break;
                    }
                } else if (privacyControlActivity.y0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i == -1) {
                    ((PrivacySettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    ((gk8) obj2).finishFragment();
                    break;
                }
                break;
        }
    }
}
