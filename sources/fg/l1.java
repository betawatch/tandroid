package fg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.cb;
import bi.o2;
import gg.j2;
import gg.k2;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e8;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y5;
import org.telegram.ui.eo;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l1 extends ul0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A0;
    public HashMap B0;
    public String D0;
    public g1 E;
    public int E0;
    public String F;
    public v0 F0;
    public j1 G;
    public eo G0;
    public j1 H;
    public final f6 H0;
    public ArrayList I;
    public ArrayList J;
    public Object[] J0;
    public ArrayList K;
    public String L;
    public ArrayList M;
    public ArrayList N;
    public String[] O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public long S;
    public TLRPC.TL_inlineBotSwitchPM T;
    public TLRPC.TL_inlineBotWebView U;
    public final sa0 V;
    public a0.i W;
    public int X;
    public int Y;
    public String Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public ArrayList d0;
    public int g0;
    public final Context h;
    public int i0;
    public int j0;
    public boolean k0;
    public TLRPC.Chat l0;
    public long n;
    public h1 n0;
    public boolean o0;
    public a3.k0 p0;
    public String q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public int t0;
    public int u0;
    public TLRPC.ChatFull v;
    public boolean v0;
    public final d2 w;
    public TLRPC.User w0;
    public ArrayList x;
    public boolean x0;
    public a0.i y;
    public b1 y0;
    public Location z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = UserConfig.selectedAccount;
    public boolean e0 = true;
    public boolean f0 = true;
    public boolean h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final a1 I0 = new a1(this, new z0(this));
    public boolean K0 = false;
    public int L0 = -1;

    public l1(Context context, long j3, long j10, sa0 sa0Var, f6 f6Var, boolean z10) {
        this.H0 = f6Var;
        this.h = context;
        this.V = sa0Var;
        this.n = j3;
        this.s = z10;
        this.r = j10;
        d2 d2Var = new d2(true);
        this.w = d2Var;
        d2Var.a = new xa.c(this, 19);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return (this.w0 == null || this.h0) && this.A0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new k1(document, str));
                this.B0.put(str2, document);
                h1 h1Var = this.n0;
                if (h1Var != null) {
                    h1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        Object obj = str;
        while (i10 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.B0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                int size2 = document.attributes.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i11++;
                }
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new k1(document, obj));
                this.B0.put(str2, document);
            }
            i10++;
            obj = obj;
        }
    }

    public final void G() {
        eo eoVar = this.G0;
        if (eoVar == null || eoVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.I0.start();
    }

    public final void H() {
        if (this.A0 == null) {
            return;
        }
        ArrayList arrayList = this.C0;
        arrayList.clear();
        int min = Math.min(6, this.A0.size());
        for (int i10 = 0; i10 < min; i10++) {
            k1 k1Var = (k1) this.A0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(k1Var.a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, k1Var.a), k1Var.b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.w0;
        if (user == null || user.id == this.S) {
            return this.T;
        }
        return null;
    }

    public final Object J(int i10) {
        String str;
        TLRPC.User user = null;
        if (this.F != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.U;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.R.get(i10);
                    }
                } else if (i10 == 0) {
                    return tL_inlineBotWebView;
                }
                i10--;
                if (i10 >= 0) {
                    return this.R.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.x;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.M;
                            if (arrayList6 != null || this.J != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.M.get(i10);
                                    }
                                    ArrayList arrayList7 = this.M;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.J;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.P;
                                    if (arrayList9 == null || (this.g0 == 1 && !(this.v instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.J.get(i10);
                                    } else if (arrayList9.get(i10) != null) {
                                        user = (TLRPC.User) this.P.get(i10);
                                        str = String.format("%s@%s", this.J.get(i10), user != null ? UserObject.getPublicUsername(user) : "");
                                    } else {
                                        str = String.format("%s", this.J.get(i10));
                                    }
                                    ArrayList arrayList10 = this.Q;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        return str;
                                    }
                                    return new i1(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i10 >= 0 && i10 < arrayList5.size()) {
                            return this.N.get(i10);
                        }
                    } else if (i10 >= 0 && i10 < arrayList4.size()) {
                        return this.I.get(i10);
                    }
                } else if (i10 >= 0 && i10 < arrayList3.size()) {
                    return this.x.get(i10);
                }
            }
        } else if (i10 >= 0 && i10 < arrayList.size()) {
            return ((k1) this.A0.get(i10)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i10 = 1;
        if (this.w0 != null && !this.h0) {
            return 1;
        }
        int i11 = this.F != null ? 2 : 0;
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.T == null && this.U == null) {
                    i10 = 0;
                }
                return size2 + i10 + i11;
            }
            ArrayList arrayList3 = this.x;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.I;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.J == null && this.M == null) {
                    ArrayList arrayList5 = this.N;
                    if (arrayList5 == null) {
                        return i11;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.M;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.J;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i11;
    }

    public final Object L(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((k1) this.A0.get(i10)).b;
    }

    public final int M(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        return this.R != null ? (this.T == null && this.U == null) ? i10 : i10 - 1 : i10;
    }

    public final boolean N() {
        return this.A0 != null;
    }

    public final void P() {
        a1 a1Var = this.I0;
        if (a1Var != null) {
            a1Var.stop();
        }
        b1 b1Var = this.y0;
        if (b1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b1Var);
            this.y0 = null;
        }
        if (this.t0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.t0, true);
            this.t0 = 0;
        }
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        this.w0 = null;
        this.T = null;
        this.h0 = true;
        this.q0 = null;
        this.r0 = null;
        this.v0 = false;
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.z0 = location;
        location.setLatitude(-1000.0d);
        this.z0.setLongitude(-1000.0d);
        T(true, this.w0, this.r0, "");
    }

    public final void R(TLRPC.User user) {
        eo eoVar;
        TLRPC.Chat chat;
        this.t0 = 0;
        this.I0.stop();
        sa0 sa0Var = this.V;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.w0 = null;
            this.T = null;
            this.h0 = true;
        } else {
            this.w0 = user;
            long j3 = user.id;
            if (j3 != this.S) {
                this.T = null;
                this.S = j3;
            }
            eo eoVar2 = this.G0;
            if (eoVar2 != null && (chat = eoVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.h0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    sa0Var.a(true);
                    return;
                }
            }
            if (this.w0.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.f).getBoolean("inlinegeo_" + this.w0.id, false) || (eoVar = this.G0) == null || eoVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(this, zArr, user2, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cb(8, this, zArr));
                    this.G0.showDialog(alertDialog$Builder.a, new di.h0(this, zArr, 2));
                }
            }
        }
        if (this.w0 == null) {
            this.v0 = true;
            this.T = null;
        } else {
            if (sa0Var != null) {
                sa0Var.b(true);
            }
            T(true, this.w0, this.r0, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0087, code lost:
    
        if (r8.length() != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.w0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.r0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.w0;
            sa0 sa0Var = this.V;
            if (user2 != null) {
                if (!this.h0 && str != null && str2 != null) {
                    return;
                } else {
                    sa0Var.a(false);
                }
            }
            b1 b1Var = this.y0;
            if (b1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var);
                this.y0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.q0) != null && !str3.equals(str))) {
                if (this.t0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.t0, true);
                    this.t0 = 0;
                }
                if (this.u0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                    this.u0 = 0;
                }
                this.w0 = null;
                this.T = null;
                this.h0 = true;
                this.q0 = null;
                this.r0 = null;
                this.I0.stop();
                this.v0 = false;
                if (sa0Var != null) {
                    sa0Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (sa0Var != null) {
                    if (this.w0 != null) {
                        sa0Var.b(true);
                    } else if (str.equals("gif")) {
                        this.q0 = "gif";
                        sa0Var.b(false);
                    }
                }
                MessagesController messagesController = MessagesController.getInstance(this.f);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
                this.r0 = str2;
                b1 b1Var2 = new b1(this, str2, str, messagesController, messagesStorage);
                this.y0 = b1Var2;
                AndroidUtilities.runOnUIThread(b1Var2, 400L);
                return;
            }
            if (this.u0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                this.u0 = 0;
            }
            this.r0 = null;
            if (sa0Var != null) {
                sa0Var.b(false);
            }
        }
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        if (!this.h0 || !this.d) {
            sa0 sa0Var = this.V;
            if (sa0Var != null) {
                sa0Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.r0 = null;
            return;
        }
        if (user.bot_inline_geo && this.z0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("_");
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(user.id);
        sb2.append("_");
        sb2.append((!user.bot_inline_geo || this.z0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.z0.getLongitude() + this.z0.getLatitude()));
        String sb3 = sb2.toString();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
        x0 x0Var = new x0(this, str, z10, user, str2, messagesStorage, sb3);
        long j3 = user.id;
        if (j3 != this.S) {
            this.T = null;
            this.S = j3;
        }
        if (z10) {
            messagesStorage.getBotCache(sb3, x0Var);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.z0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.z0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.z0.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f).getInputPeer(this.n);
        }
        this.u0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, x0Var, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0729, code lost:
    
        if (r17.toLowerCase().startsWith(r3) == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x073c, code lost:
    
        if (r14.toLowerCase().startsWith(r3) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x074c, code lost:
    
        if (r15.toLowerCase().startsWith(r3) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06dd, code lost:
    
        if (r13.user_id == r11.id) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x03f5, code lost:
    
        if (r10 != ':') goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0412, code lost:
    
        if (r29.v != null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0414, code lost:
    
        if (r13 == 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0416, code lost:
    
        r29.Z = r7;
        r29.c0 = r3;
        r29.d0 = r0;
        r2.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0420, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0764 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0503  */
    /* JADX WARN: Type inference failed for: r11v22, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v26, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r29v0, types: [fg.l1, java.lang.Object, s4.h0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.telegram.ui.Components.sa0] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v24, types: [fg.j1] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [a0.i, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        int i11;
        ArrayList arrayList2;
        ?? r22;
        String str3;
        eo eoVar;
        char c10;
        int i12;
        String str4;
        String str5;
        char c11;
        ?? r15;
        int i13;
        ?? r32;
        j1 j1Var;
        ?? r62;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j3;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i14;
        long j10;
        String str8;
        String publicUsername;
        String str9;
        TLRPC.Chat chat2;
        long j11;
        boolean z12;
        TLRPC.Chat chat3;
        ArrayList arrayList4;
        sa0 sa0Var;
        sa0 sa0Var2;
        String str10;
        char c12;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat4 = this.l0;
        eo eoVar2 = this.G0;
        if (eoVar2 != null) {
            chat4 = eoVar2.e;
            eoVar2.i();
        }
        TLRPC.Chat chat5 = chat4;
        a3.k0 k0Var = this.p0;
        if (k0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k0Var);
            this.p0 = null;
        }
        if (this.j0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.j0, true);
            this.j0 = 0;
        }
        g1 g1Var = this.E;
        if (g1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g1Var);
            this.E = null;
        }
        v0 v0Var = this.F0;
        if (v0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v0Var);
            this.F0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        sa0 sa0Var3 = this.V;
        if (isEmpty || charSequence2.length() > MessagesController.getInstance(this.f).getMaxMessageLength()) {
            S(null, null);
            sa0Var3.a(false);
            this.Z = null;
            this.D0 = null;
            this.A0 = null;
            this.B0 = null;
            l();
            this.o0 = false;
            if (this.E0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.E0, true);
                this.E0 = 0;
            }
            h1 h1Var = this.n0;
            if (h1Var != null) {
                h1Var.a();
                return;
            }
            return;
        }
        int i15 = charSequence2.length() > 0 ? i10 - 1 : i10;
        this.Z = null;
        this.b0 = z10;
        this.a0 = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z13 = !z10 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z13) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            int i16 = 0;
            while (i16 < length) {
                char charAt = charSequence3.charAt(i16);
                int i17 = length - 1;
                if (i16 < i17) {
                    str10 = str11;
                    c12 = charSequence3.charAt(i16 + 1);
                } else {
                    str10 = str11;
                    c12 = 0;
                }
                if (i16 < i17 && charAt == 55356 && c12 >= 57339 && c12 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i16), charSequence3.subSequence(i16 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i16), charSequence3.subSequence(i16 + 1, charSequence3.length()));
                    length--;
                } else {
                    i16++;
                    str11 = str10;
                }
                i16--;
                i16++;
                str11 = str10;
            }
            str = str11;
            this.D0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            str2 = str;
        }
        boolean z14 = z13 && (Emoji.isValidEmoji(str2) || Emoji.isValidEmoji(this.D0));
        if (z14 && (charSequence instanceof Spanned)) {
            y5[] y5VarArr = (y5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), y5.class);
            z14 = y5VarArr == null || y5VarArr.length == 0;
        }
        if (this.c && z14 && (chat5 == null || ChatObject.canSendStickers(chat5))) {
            ArrayList arrayList5 = this.C0;
            arrayList5.clear();
            int i18 = SharedConfig.suggestStickers;
            if (i18 == 2 || !z14) {
                if (this.o0 && i18 == 2) {
                    this.o0 = false;
                    sa0Var3.a(false);
                    l();
                    return;
                }
                return;
            }
            this.A0 = null;
            this.B0 = null;
            if (this.E0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.E0, true);
                this.E0 = 0;
            }
            boolean z15 = MessagesController.getInstance(this.f).suggestStickersApiOnly;
            if (z15) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i11 = i10;
            } else {
                arrayList4 = arrayList5;
                i11 = i10;
                arrayList2 = arrayList;
                this.F0 = new v0((l1) this, charSequence, i11, arrayList, z10, z11);
                MediaDataController.getInstance(this.f).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.f).loadRecents(2, false, true, false);
                ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(0);
                ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(2);
                int min = Math.min(20, recentStickersNoCopy.size());
                int i19 = 0;
                for (int i20 = 0; i20 < min; i20++) {
                    TLRPC.Document document = recentStickersNoCopy.get(i20);
                    if (O(document, this.D0)) {
                        E(document, "recent");
                        int i21 = i19 + 1;
                        if (i21 >= 5) {
                            break;
                        } else {
                            i19 = i21;
                        }
                    }
                }
                int size = recentStickersNoCopy2.size();
                for (int i22 = 0; i22 < size; i22++) {
                    TLRPC.Document document2 = recentStickersNoCopy2.get(i22);
                    if (O(document2, this.D0)) {
                        E(document2, "fav");
                    }
                }
                MediaDataController.getInstance(this.f).checkStickers(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.f).getAllStickers();
                ArrayList<TLRPC.Document> arrayList6 = allStickers != null ? allStickers.get(this.D0) : null;
                if (arrayList6 != null && !arrayList6.isEmpty()) {
                    F(null, arrayList6);
                }
                ArrayList arrayList7 = this.A0;
                if (arrayList7 != null) {
                    Collections.sort(arrayList7, new c1(recentStickersNoCopy2, recentStickersNoCopy));
                }
            }
            if (SharedConfig.suggestStickers == 0 || z15) {
                String str12 = this.D0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.E0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new o2(6, this, str12));
            }
            ArrayList arrayList8 = this.A0;
            if (arrayList8 == null || arrayList8.isEmpty()) {
                sa0 sa0Var4 = sa0Var3;
                sa0Var = sa0Var4;
                if (this.o0) {
                    sa0Var4.a(false);
                    this.o0 = false;
                    sa0Var = sa0Var4;
                }
            } else {
                if (SharedConfig.suggestStickers != 0 || this.A0.size() >= 5) {
                    sa0 sa0Var5 = sa0Var3;
                    H();
                    sa0Var5.a(arrayList4.isEmpty());
                    this.o0 = true;
                    sa0Var2 = sa0Var5;
                } else {
                    sa0 sa0Var6 = sa0Var3;
                    sa0Var6.a(false);
                    this.o0 = false;
                    sa0Var2 = sa0Var6;
                }
                l();
                sa0Var = sa0Var2;
            }
            c10 = 4;
            str3 = null;
            r22 = sa0Var;
        } else {
            i11 = i10;
            arrayList2 = arrayList;
            r22 = sa0Var3;
            if (!z10 && this.f0 && charSequence2.charAt(0) == '@') {
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    str4 = charSequence2.substring(1, indexOf);
                    str5 = charSequence2.substring(indexOf + 1);
                    i12 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i12 = 1;
                    str4 = charSequence2.substring(1);
                    str5 = str;
                } else {
                    i12 = 1;
                    S(null, null);
                    str4 = null;
                    str5 = null;
                }
                if (str4 != null && str4.length() >= i12) {
                    for (int i23 = 1; i23 < str4.length(); i23++) {
                        char charAt2 = str4.charAt(i23);
                        if ((charAt2 >= '0' && charAt2 <= '9') || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '_'))) {
                        }
                    }
                    S(str4, str5);
                    str3 = null;
                }
                str4 = str;
                S(str4, str5);
                str3 = null;
            } else if (!this.c || (eoVar = this.G0) == null || eoVar.h != null || (!(chat5 == null || ChatObject.canSendStickers(chat5)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                str3 = null;
                S(null, null);
            } else {
                str3 = null;
                S(null, null);
            }
            c10 = 65535;
        }
        if (this.w0 != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.f);
        String str13 = this.F;
        this.F = str3;
        d2 d2Var = this.w;
        if (!z10) {
            while (i15 >= 0) {
                if (i15 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i15);
                    if (i15 != 0) {
                        int i24 = i15 - 1;
                        if (charSequence2.charAt(i24) != ' ') {
                            if (charSequence2.charAt(i24) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z16 = this.m0;
                        if (z16 || this.e0 || (this.f0 && i15 == 0)) {
                            this.X = i15;
                            this.Y = sb2.length() + 1;
                            c10 = 0;
                            c11 = 4;
                            r15 = 0;
                            break;
                        }
                        sb2.insert(0, charAt3);
                    } else if (charAt3 == '#') {
                        if (!ChatObject.isChannelAndNotMegaGroup(chat5) || TextUtils.isEmpty(ChatObject.getPublicUsername(chat5))) {
                            c11 = 4;
                        } else {
                            String substring = charSequence2.substring(i15);
                            this.F = substring;
                            c11 = 4;
                            if (substring.length() < 4 || !this.F.matches("^[#$][\\p{L}_-]+$")) {
                                this.F = null;
                            }
                        }
                        if (!d2Var.s) {
                            MessagesStorage.getInstance(d2Var.m).getStorageQueue().postRunnable(new a2(d2Var, 1));
                            this.Z = charSequence2;
                            this.c0 = i11;
                            this.d0 = arrayList2;
                            return;
                        }
                        this.X = i15;
                        c10 = 1;
                        this.Y = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                    } else {
                        c11 = 4;
                        if (i15 == 0 && this.W != null && charAt3 == '/') {
                            this.X = i15;
                            this.Y = sb2.length() + 1;
                            c10 = 2;
                        } else {
                            if (charAt3 == ':' && sb2.length() > 0) {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                    i13 = 1;
                                    if (sb2.length() > 1) {
                                    }
                                } else {
                                    i13 = 1;
                                }
                                this.X = i15;
                                this.Y = sb2.length() + i13;
                                c10 = 3;
                            }
                            sb2.insert(0, charAt3);
                        }
                    }
                }
                i15--;
            }
            c11 = 4;
            r15 = 0;
            i15 = -1;
            if (str13 != null && this.F != null) {
                s(r15, 2);
            } else if (str13 == null && this.F == null) {
                t(r15, 2);
            } else {
                r32 = this.G;
                if (r32 != 0) {
                    r32.a(r15, this.F, chat5);
                }
                j1Var = this.H;
                if (j1Var != null) {
                    j1Var.a(1, this.F, chat5);
                }
            }
            if (c10 != 65535) {
                this.x0 = r15;
                this.R = null;
                r22.a(r15);
                return;
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    String lowerCase = sb2.toString().toLowerCase();
                    ArrayList arrayList10 = d2Var.q;
                    for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                        b2 b2Var = (b2) arrayList10.get(i25);
                        if (b2Var != null && (str7 = b2Var.a) != null && str7.startsWith(lowerCase)) {
                            arrayList9.add(b2Var.a);
                        }
                    }
                    this.I = arrayList9;
                    this.A0 = null;
                    this.x = null;
                    this.y = null;
                    this.M = null;
                    this.J = null;
                    this.Q = null;
                    this.K = null;
                    this.P = null;
                    this.N = null;
                    this.x0 = false;
                    this.R = null;
                    l();
                    r22.a((this.I.isEmpty() && this.F == null) ? false : true);
                    return;
                }
                if (c10 != 2) {
                    if (c10 == 3) {
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        if (!Arrays.equals(currentKeyboardLanguage, this.O)) {
                            MediaDataController.getInstance(this.f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        this.O = currentKeyboardLanguage;
                        MediaDataController.getInstance(this.f).getEmojiSuggestions(this.O, sb2.toString(), false, new w0(this), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(this.f).isPremium());
                        return;
                    }
                    if (c10 == c11) {
                        this.I = null;
                        this.x = null;
                        this.y = null;
                        this.N = null;
                        this.J = null;
                        this.Q = null;
                        this.M = null;
                        this.K = null;
                        this.P = null;
                        return;
                    }
                    return;
                }
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                String lowerCase2 = sb2.toString().toLowerCase();
                for (int i26 = 0; i26 < this.W.m(); i26++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.W.n(i26);
                    for (int i27 = 0; i27 < botInfo.commands.size(); i27++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i27);
                        if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                            arrayList11.add("/" + botCommand.command);
                            arrayList12.add(botCommand.description);
                            arrayList13.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                            arrayList14.add(Boolean.valueOf(botCommand.ephemeral));
                        }
                    }
                }
                if (this.G0 != null && !DialogObject.isEncryptedDialog(this.n)) {
                    eo eoVar3 = this.G0;
                    if (eoVar3.R3 == 0 && eoVar3.i() != null && !this.G0.i().bot && !UserObject.isReplyUser(this.G0.i()) && !UserObject.isService(this.G0.i().id)) {
                        k2 f7 = k2.f(this.f);
                        ArrayList arrayList15 = f7.b;
                        f7.h();
                        this.L = lowerCase2;
                        this.M = new ArrayList();
                        for (int i28 = 0; i28 < arrayList15.size(); i28++) {
                            j2 j2Var = (j2) arrayList15.get(i28);
                            if (!k2.g(j2Var.b)) {
                                String lowerCase3 = j2Var.b.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase2) || AndroidUtilities.translitSafe(lowerCase3).startsWith(lowerCase2)) {
                                    this.M.add(j2Var);
                                }
                            }
                        }
                        r62 = 0;
                        this.I = r62;
                        this.A0 = r62;
                        this.x = r62;
                        this.y = r62;
                        this.N = r62;
                        this.J = arrayList11;
                        this.K = arrayList12;
                        this.P = arrayList13;
                        this.Q = arrayList14;
                        this.x0 = false;
                        this.R = r62;
                        l();
                        r22.a(arrayList11.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
                        return;
                    }
                }
                r62 = 0;
                this.L = null;
                this.M = null;
                this.I = r62;
                this.A0 = r62;
                this.x = r62;
                this.y = r62;
                this.N = r62;
                this.J = arrayList11;
                this.K = arrayList12;
                this.P = arrayList13;
                this.Q = arrayList14;
                this.x0 = false;
                this.R = r62;
                l();
                r22.a(arrayList11.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
                return;
            }
            this.x0 = r15;
            this.R = null;
            ArrayList arrayList16 = new ArrayList();
            if (arrayList2 != null) {
                for (int i29 = 0; i29 < Math.min(100, arrayList2.size()); i29++) {
                    long fromChatId = ((MessageObject) arrayList2.get(i29)).getFromChatId();
                    if (fromChatId > 0 && !arrayList16.contains(Long.valueOf(fromChatId))) {
                        arrayList16.add(Long.valueOf(fromChatId));
                    }
                }
            }
            String lowerCase4 = sb2.toString().toLowerCase();
            boolean z17 = lowerCase4.indexOf(32) >= 0;
            ArrayList arrayList17 = new ArrayList();
            a0.i iVar = new a0.i();
            a0.i iVar2 = new a0.i();
            ArrayList arrayList18 = new ArrayList();
            arrayList18.addAll(MediaDataController.getInstance(this.f).inlineBots);
            if (chat5 == null || (!ChatObject.isMonoForum(chat5) && !ChatObject.isChannelAndNotMegaGroup(chat5))) {
                arrayList18.addAll(MediaDataController.getInstance(this.f).guestBots);
            }
            List.-EL.sort(arrayList18, new a4.e(6));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size2 = arrayList18.size();
            int i30 = 0;
            while (i30 < size2) {
                Object obj = arrayList18.get(i30);
                i30++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
            }
            ArrayList arrayList19 = new ArrayList(linkedHashMap.values());
            if (!z10 && this.f0 && i15 == 0 && !arrayList19.isEmpty()) {
                int i31 = 0;
                for (int i32 = 0; i32 < arrayList19.size(); i32++) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList19.get(i32)).peer.user_id));
                    if (user != null) {
                        String publicUsername2 = UserObject.getPublicUsername(user);
                        if (!TextUtils.isEmpty(publicUsername2) && (lowerCase4.length() == 0 || publicUsername2.toLowerCase().startsWith(lowerCase4))) {
                            arrayList17.add(user);
                            iVar.k(user, user.id);
                            iVar2.k(user, user.id);
                            i31++;
                        }
                        if (i31 == 5) {
                            break;
                        }
                    }
                }
            }
            eo eoVar4 = this.G0;
            if (eoVar4 != null) {
                chat5 = eoVar4.e;
                j3 = eoVar4.d4;
            } else {
                TLRPC.ChatFull chatFull2 = this.v;
                if (chatFull2 != null) {
                    chat5 = messagesController.getChat(Long.valueOf(chatFull2.id));
                }
                j3 = 0;
            }
            ?? currentUser = UserConfig.getInstance(this.f).getCurrentUser();
            if (chat5 != null && (chatFull = this.v) != null && chatFull.participants != null && (!ChatObject.isChannel(chat5) || chat5.megagroup)) {
                int i33 = -2;
                int i34 = -2;
                while (i34 < this.v.participants.participants.size()) {
                    if (i34 != i33) {
                        i14 = i34;
                        if (i14 == -1) {
                            if (z11) {
                                if (lowerCase4.length() == 0) {
                                    arrayList17.add(chat5);
                                } else {
                                    String str14 = chat5.title;
                                    publicUsername = ChatObject.getPublicUsername(chat5);
                                    j10 = j3;
                                    chat3 = chat5;
                                    chat2 = currentUser;
                                    j11 = -chat5.id;
                                    str8 = str14;
                                    str9 = null;
                                    if (TextUtils.isEmpty(publicUsername)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    if (!z12) {
                                    }
                                }
                            }
                            z12 = z17;
                            j10 = j3;
                            chat2 = currentUser;
                        } else {
                            TLRPC.ChatParticipant chatParticipant = this.v.participants.participants.get(i14);
                            if (currentUser != null) {
                                j10 = j3;
                            } else {
                                j10 = j3;
                            }
                            ?? user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                            if (user2 != 0 && !UserObject.isUserSelf(user2) && iVar.h(user2.id) < 0) {
                                if (lowerCase4.length() != 0 || user2.deleted) {
                                    str8 = user2.first_name;
                                    String str15 = user2.last_name;
                                    publicUsername = UserObject.getPublicUsername(user2);
                                    str9 = str15;
                                    chat2 = currentUser;
                                    j11 = user2.id;
                                    chat3 = user2;
                                    if (TextUtils.isEmpty(publicUsername)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    if (!z12) {
                                    }
                                } else {
                                    arrayList17.add(user2);
                                }
                            }
                            z12 = z17;
                            chat2 = currentUser;
                        }
                    } else if (currentUser == null || !z10) {
                        z12 = z17;
                        j10 = j3;
                        i14 = i34;
                        chat2 = currentUser;
                    } else {
                        str8 = currentUser.first_name;
                        str9 = currentUser.last_name;
                        publicUsername = UserObject.getPublicUsername(currentUser);
                        j10 = j3;
                        TLRPC.Chat chat6 = currentUser;
                        j11 = currentUser.id;
                        i14 = i34;
                        chat2 = chat6;
                        chat3 = chat6;
                        if (TextUtils.isEmpty(publicUsername)) {
                            z12 = z17;
                        } else {
                            z12 = z17;
                        }
                        if (!TextUtils.isEmpty(str8)) {
                        }
                        if (!TextUtils.isEmpty(str9)) {
                        }
                        if (!z12) {
                            if (ContactsController.formatName(str8, str9).toLowerCase().startsWith(lowerCase4)) {
                            }
                            arrayList17.add(chat3);
                            iVar2.k(chat3, j11);
                        }
                    }
                    int i35 = i14 + 1;
                    j3 = j10;
                    currentUser = chat2;
                    i33 = -2;
                    i34 = i35;
                    z17 = z12;
                }
            }
            boolean z18 = z17;
            long j12 = j3;
            if (this.m0) {
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.f).getAllDialogs();
                for (int i36 = 0; i36 < allDialogs.size(); i36++) {
                    if (allDialogs.get(i36).id > 0) {
                        TLRPC.User user3 = messagesController.getUser(Long.valueOf(allDialogs.get(i36).id));
                        if (user3 != null && !UserObject.isUserSelf(user3) && iVar.h(user3.id) < 0) {
                            if (lowerCase4.length() != 0 || user3.deleted) {
                                String str16 = user3.first_name;
                                String str17 = user3.last_name;
                                String publicUsername3 = UserObject.getPublicUsername(user3);
                                long j13 = user3.id;
                                if ((!TextUtils.isEmpty(publicUsername3) && publicUsername3.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z18 && ContactsController.formatName(str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                    arrayList17.add(user3);
                                    iVar2.k(user3, j13);
                                }
                            } else {
                                arrayList17.add(user3);
                            }
                        }
                    } else if (!TextUtils.isEmpty(lowerCase4) && (chat = messagesController.getChat(Long.valueOf(-allDialogs.get(i36).id))) != null && chat.username != null && iVar.h(chat.id) < 0) {
                        if (lowerCase4.length() == 0) {
                            arrayList17.add(chat);
                        } else {
                            String str18 = chat.title;
                            String str19 = chat.username;
                            long j14 = chat.id;
                            if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                                arrayList17.add(chat);
                                iVar2.k(chat, j14);
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList17, new d1(iVar2, arrayList16));
            this.I = null;
            this.A0 = null;
            this.M = null;
            this.J = null;
            this.Q = null;
            this.K = null;
            this.P = null;
            this.N = null;
            if (((chat5 == null || !chat5.megagroup) && !this.m0) || lowerCase4.length() <= 0) {
                Y(iVar2, arrayList17, true);
                return;
            }
            if (arrayList17.size() < 5) {
                a3.k0 k0Var2 = new a3.k0(this, arrayList17, iVar2, 24);
                this.p0 = k0Var2;
                AndroidUtilities.runOnUIThread(k0Var2, 1000L);
            } else {
                Y(iVar2, arrayList17, true);
            }
            g1 g1Var2 = new g1(this, chat5, lowerCase4, j12, arrayList17, iVar2, messagesController);
            this.E = g1Var2;
            AndroidUtilities.runOnUIThread(g1Var2, 200L);
            return;
        }
        sb2.append(charSequence2.substring(1));
        this.X = 0;
        this.Y = sb2.length();
        c10 = 0;
        c11 = 4;
        i15 = -1;
        r15 = 0;
        if (str13 != null) {
        }
        if (str13 == null) {
        }
        r32 = this.G;
        if (r32 != 0) {
        }
        j1Var = this.H;
        if (j1Var != null) {
        }
        if (c10 != 65535) {
        }
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        eo eoVar;
        TLRPC.Chat chat;
        this.f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.h0 && this.w0 != null && (eoVar = this.G0) != null && (chat = eoVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.h0 = canSendStickers;
            if (canSendStickers) {
                this.x = null;
                l();
                this.V.a(false);
                R(this.w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.c0, this.d0, this.b0, this.a0);
        }
    }

    public final void X(eo eoVar) {
        this.G0 = eoVar;
    }

    public final void Y(a0.i iVar, ArrayList arrayList, boolean z10) {
        this.x = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.y = iVar;
        a3.k0 k0Var = this.p0;
        if (k0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k0Var);
            this.p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z10) {
            l();
            this.V.a(!this.x.isEmpty());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v0 v0Var;
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.A0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.C0;
            if (arrayList2.isEmpty() || !this.o0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.V.a(K() > 0);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            v0 v0Var2 = this.F0;
            if (v0Var2 != null) {
                AndroidUtilities.runOnUIThread(v0Var2);
                this.F0 = null;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (v0Var = this.F0) != null) {
            AndroidUtilities.runOnUIThread(v0Var);
            this.F0 = null;
        }
    }

    @Override // s4.h0
    public final int h() {
        int K = K();
        this.L0 = K;
        return K;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.A0 != null) {
            return 4;
        }
        if (this.w0 != null && !this.h0) {
            return 3;
        }
        if (this.R == null) {
            ArrayList arrayList = this.M;
            return (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? 0 : 5;
        }
        if (i10 == 0) {
            return (this.T == null && this.U == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // s4.h0
    public final void l() {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i10 = this.L0;
        sa0 sa0Var = this.V;
        int i11 = 0;
        if (i10 != -1 && this.J0 != null) {
            int K = K();
            this.L0 = K;
            boolean z10 = i10 != K;
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.J0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof j2)) {
                            if (obj != obj2 && ((!(obj instanceof k1) || !(obj2 instanceof k1) || ((k1) obj).a != ((k1) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                m(i11);
                z10 = true;
                i11++;
            }
            t(min, i10 - min);
            s(min, K - min);
            if (z10 && sa0Var != null) {
                sa0Var.c();
            }
            this.J0 = objArr;
            return;
        }
        if (sa0Var != null) {
            this.L0 = K();
            sa0Var.c();
        }
        super.l();
        int K2 = K();
        this.L0 = K2;
        this.J0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.J0;
            if (i11 >= objArr3.length) {
                return;
            }
            objArr3[i11] = J(i11);
            i11++;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        eo eoVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f7;
        String str = this.F;
        int i11 = str != null ? i10 - 2 : i10;
        int i12 = c1Var.f;
        View view = c1Var.a;
        Boolean bool = null;
        if (i12 == 4) {
            e8 e8Var = (e8) view;
            if (i11 < 0 || i11 >= this.A0.size()) {
                return;
            }
            k1 k1Var = (k1) this.A0.get(i11);
            TLRPC.Document document = k1Var.a;
            Object obj = k1Var.b;
            qg.e1 e1Var = e8Var.n;
            w9 w9Var = e8Var.a;
            e8Var.c = obj;
            boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
            e8Var.s = isPremiumSticker;
            if (isPremiumSticker) {
                e1Var.setColor(j6.w0(null, j6.d6, false));
                e1Var.H = true;
                e1Var.I = false;
                e1Var.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.a7, 1.0f, 1.0f, e8Var.v);
            if (!MessageObject.canAutoplayAnimatedSticker(document)) {
                f7 = 1.0f;
                if (svgThumb == null) {
                    w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, e8Var.c);
                } else if (closestPhotoSizeWithSize != null) {
                    w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, e8Var.c);
                } else {
                    w9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, e8Var.c);
                }
            } else if (svgThumb != null) {
                w9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, e8Var.c);
                f7 = 1.0f;
            } else if (closestPhotoSizeWithSize != null) {
                f7 = 1.0f;
                w9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, e8Var.c);
            } else {
                f7 = 1.0f;
                w9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, e8Var.c);
            }
            e8Var.b = document;
            Drawable background = e8Var.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Be, false), PorterDuff.Mode.MULTIPLY));
            }
            if (e8Var.s) {
                e8Var.r = true;
            } else {
                e8Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                int dp = AndroidUtilities.dp(16.0f);
                layoutParams.width = dp;
                layoutParams.height = dp;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                e1Var.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            } else {
                int dp2 = AndroidUtilities.dp(24.0f);
                layoutParams.width = dp2;
                layoutParams.height = dp2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            e1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
            AndroidUtilities.updateViewVisibilityAnimated(e1Var, e8Var.r, 0.9f, false);
            e8Var.invalidate();
            e8Var.setClearsInputField(true);
            return;
        }
        if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.e;
            if (chat != null) {
                if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                    return;
                } else if (AndroidUtilities.isBannedForever(chat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                    return;
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i12 == 5) {
            gg.g2 g2Var = (gg.g2) view;
            ArrayList arrayList = this.M;
            if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            g2Var.a((j2) this.M.get(i11), this.L, false);
            return;
        }
        ArrayList arrayList2 = this.R;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.U == null) ? false : true;
            if (i12 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.i0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.U.text);
                    return;
                }
                return;
            } else {
                if (z10) {
                    i11--;
                }
                if (i11 < 0 || i11 >= arrayList2.size()) {
                    return;
                }
                ((org.telegram.ui.Cells.e2) view).e((TLRPC.BotInlineResult) this.R.get(i11), this.w0, this.x0, i11 != this.R.size() - 1, z10 && i11 == 0, "gif".equals(this.q0));
                return;
            }
        }
        if (i12 == 6) {
            j1 j1Var = (j1) view;
            int i13 = i11 + 2;
            if (i13 == 0) {
                this.G = j1Var;
            } else {
                this.H = j1Var;
            }
            TLRPC.Chat chat2 = this.l0;
            if (chat2 == null && (eoVar = this.G0) != null) {
                chat2 = eoVar.e;
            }
            j1Var.a(i13, str, chat2);
            return;
        }
        if (i12 == 7) {
            return;
        }
        h5 h5Var = (h5) view;
        ArrayList arrayList3 = this.x;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i11);
            if (tLObject instanceof TLRPC.User) {
                h5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                h5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.I;
            if (arrayList4 == null || i11 < 0 || i11 >= arrayList4.size()) {
                ArrayList arrayList5 = this.N;
                if (arrayList5 == null || i11 < 0 || i11 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.J;
                    if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                        ArrayList arrayList7 = this.K;
                        String str2 = (arrayList7 == null || i11 < 0 || i11 >= arrayList7.size()) ? null : (String) this.K.get(i11);
                        ArrayList arrayList8 = this.P;
                        TLRPC.User user = (arrayList8 == null || i11 < 0 || i11 >= arrayList8.size()) ? null : (TLRPC.User) this.P.get(i11);
                        ArrayList arrayList9 = this.Q;
                        if (arrayList9 != null && i11 >= 0 && i11 < arrayList9.size()) {
                            bool = (Boolean) this.Q.get(i11);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str3 = (String) this.J.get(i11);
                        di.h hVar = h5Var.b;
                        TextView textView2 = h5Var.c;
                        g9 g9Var = h5Var.d;
                        w9 w9Var2 = h5Var.a;
                        h5Var.a();
                        if (user != null) {
                            w9Var2.setVisibility(0);
                            g9Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                w9Var2.setImageDrawable(g9Var);
                            } else {
                                w9Var2.e(user, g9Var);
                            }
                        } else {
                            w9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            uq uqVar = new uq(R.drawable.mini_ephemeral_hidden_14, 0);
                            uqVar.setColorKey(j6.A6);
                            uqVar.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            hVar.setText(spannableStringBuilder);
                        } else {
                            hVar.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    h5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.N.get(i11));
                }
            } else {
                h5Var.setText((String) this.I.get(i11));
            }
        }
        h5Var.setDivider(false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        f6 f6Var = this.H0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context);
                    TextView textView = new TextView(context);
                    i0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    textView.setTextColor(j6.w0(null, j6.Ce, false));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    i0Var.addView(textView, a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = i0Var;
                } else if (i10 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(j6.v0(j6.z6, f6Var));
                    view2 = textView2;
                } else if (i10 != 5) {
                    boolean z10 = this.s;
                    if (i10 == 6) {
                        view2 = new j1(context, f6Var, z10);
                    } else if (i10 != 7) {
                        e8 e8Var = new e8(context);
                        e8Var.v = f6Var;
                        w9 w9Var = new w9(context);
                        e8Var.a = w9Var;
                        w9Var.setAspectFit(true);
                        w9Var.setLayerNum(1);
                        e8Var.addView(w9Var, a6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        e8Var.setFocusable(true);
                        qg.e1 e1Var = new qg.e1(context, 1, null);
                        e8Var.n = e1Var;
                        e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        e1Var.setImageReceiver(w9Var.getImageReceiver());
                        e8Var.addView(e1Var, a6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = e8Var;
                    } else {
                        View qnVar = new qn(context, 5);
                        vq vqVar = new vq(new ColorDrawable(z10 ? j6.l1(0.15f, -1) : j6.v0(j6.a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.b7, f6Var)), 0, 0);
                        vqVar.w = true;
                        qnVar.setBackground(vqVar);
                        view = qnVar;
                    }
                } else {
                    view = new gg.g2(context, f6Var, false);
                }
            } else {
                org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context);
                e2Var.setDelegate(new w0(this));
                view2 = e2Var;
            }
            return new fl0(view2);
        }
        h5 h5Var = new h5(context, f6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        view2 = view;
        return new fl0(view2);
    }
}
