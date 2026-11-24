// default package

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jf2 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jf2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                uf2 uf2Var = (uf2) this.c;
                ResultCallback resultCallback = (ResultCallback) this.d;
                boolean z = this.b;
                TL_account.Themes themes = (TL_account.Themes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (themes instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
                    uf2Var.c = tL_themes.hash;
                    uf2Var.d = System.currentTimeMillis();
                    SharedPreferences.Editor edit = uf2Var.f().edit();
                    edit.clear();
                    edit.putLong("hash", uf2Var.c);
                    edit.putLong("lastReload", uf2Var.d);
                    edit.putInt("count", tL_themes.themes.size());
                    ArrayList arrayList2 = new ArrayList(tL_themes.themes.size());
                    for (int i = 0; i < tL_themes.themes.size(); i++) {
                        TLRPC.TL_theme tL_theme = tL_themes.themes.get(i);
                        gw3.k(tL_theme.emoticon);
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        tL_theme.serializeToStream(serializedData);
                        edit.putString("theme_" + i, Utilities.f(serializedData.toByteArray()));
                        tz3 tz3Var = new tz3(uf2Var.currentAccount, tL_theme);
                        tz3Var.p(0, null);
                        tz3Var.p(1, null);
                        tz3Var.n(0, null);
                        tz3Var.n(1, null);
                        arrayList2.add(tz3Var);
                    }
                    edit.apply();
                    arrayList = arrayList2;
                } else if (!(themes instanceof TL_account.TL_themesNotModified)) {
                    gm.c3(new ra2(resultCallback, tL_error, (byte) 14));
                    arrayList = null;
                    if (r2) {
                        gm.c3(new rh((Object) uf2Var, (Object) arrayList, (Object) resultCallback, z, (byte) 13));
                        break;
                    }
                } else {
                    arrayList = uf2Var.b();
                }
                r2 = false;
                if (r2) {
                }
                break;
            case 1:
                wg2 wg2Var = (wg2) this.c;
                xib xibVar = (xib) this.d;
                boolean z2 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    wg2Var.getMessagesController().T3(updates, false);
                    break;
                } else {
                    wg2Var.getClass();
                    if (tL_error2 != null) {
                        xibVar.setChecked(z2);
                        c41.b0(wg2Var).g0(tL_error2, false);
                        break;
                    }
                }
                break;
            default:
                my8 my8Var = (my8) this.c;
                int[] iArr = (int[]) this.d;
                boolean z3 = this.b;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                wy8 wy8Var = my8Var.b;
                if (my8Var.n == iArr[0] && !my8Var.F) {
                    my8Var.n = 0;
                    if (tL_exportedNoPaidMessagesToken == null) {
                        String str = tL_error3 != null ? tL_error3.text : null;
                        fc4.d("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = my8Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z3) {
                                if (str != null) {
                                    wy8Var.getClass();
                                    wy8Var.d1(R.drawable.msg_warning, jb6.M0(2131751042, null), null);
                                    break;
                                }
                            }
                        }
                        my8Var.d = (byte) 0;
                        my8Var.f().edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (wy8Var.w0) {
                            wy8Var.U0(str != null ? jb6.M0(2131751042, null) : null);
                            break;
                        } else if (str != null) {
                            wy8Var.d1(R.drawable.msg_warning, jb6.M0(2131751042, null), null);
                            break;
                        }
                    } else {
                        byte b = my8Var.d;
                        if (b != 0) {
                            if (z3 == (b == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    my8Var.f().edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                my8Var.f = tL_exportedNoPaidMessagesToken;
                                my8Var.h = SystemClock.elapsedRealtime();
                                wy8Var.setFreeLink(my8Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
