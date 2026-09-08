package hg;

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
import bi.c4;
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
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.z5;
import org.telegram.ui.co;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k1 extends kl0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A0;
    public HashMap B0;
    public String D0;
    public f1 E;
    public int E0;
    public String F;
    public v0 F0;
    public i1 G;
    public co G0;
    public i1 H;
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
    public final ja0 V;
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
    public g1 n0;
    public boolean o0;
    public t p0;
    public String q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public int t0;
    public int u0;
    public TLRPC.ChatFull v;
    public boolean v0;
    public final b2 w;
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

    public k1(Context context, long j3, long j10, ja0 ja0Var, f6 f6Var, boolean z10) {
        this.H0 = f6Var;
        this.h = context;
        this.V = ja0Var;
        this.n = j3;
        this.s = z10;
        this.r = j10;
        b2 b2Var = new b2(true);
        this.w = b2Var;
        b2Var.a = new a6.m(this, 22);
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

    @Override // org.telegram.ui.Components.kl0
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
                this.A0.add(new j1(document, str));
                this.B0.put(str2, document);
                g1 g1Var = this.n0;
                if (g1Var != null) {
                    g1Var.a();
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
                this.A0.add(new j1(document, obj));
                this.B0.put(str2, document);
            }
            i10++;
            obj = obj;
        }
    }

    public final void G() {
        co coVar = this.G0;
        if (coVar == null || coVar.getParentActivity() == null) {
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
            j1 j1Var = (j1) this.A0.get(i10);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(j1Var.a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, j1Var.a), j1Var.b, "webp", 1, 1);
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
                                    return new h1(str, user != null ? user.id : 0L);
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
            return ((j1) this.A0.get(i10)).a;
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
        return ((j1) this.A0.get(i10)).b;
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
        co coVar;
        TLRPC.Chat chat;
        this.t0 = 0;
        this.I0.stop();
        ja0 ja0Var = this.V;
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
            co coVar2 = this.G0;
            if (coVar2 != null && (chat = coVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.h0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    ja0Var.a(true);
                    return;
                }
            }
            if (this.w0.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.f).getBoolean("inlinegeo_" + this.w0.id, false) || (coVar = this.G0) == null || coVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(this, zArr, user2, 9));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ah.i0(13, this, zArr));
                    this.G0.showDialog(alertDialog$Builder.a, new fi.e0(this, zArr, 2));
                }
            }
        }
        if (this.w0 == null) {
            this.v0 = true;
            this.T = null;
        } else {
            if (ja0Var != null) {
                ja0Var.b(true);
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
            ja0 ja0Var = this.V;
            if (user2 != null) {
                if (!this.h0 && str != null && str2 != null) {
                    return;
                } else {
                    ja0Var.a(false);
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
                if (ja0Var != null) {
                    ja0Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (ja0Var != null) {
                    if (this.w0 != null) {
                        ja0Var.b(true);
                    } else if (str.equals("gif")) {
                        this.q0 = "gif";
                        ja0Var.b(false);
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
            if (ja0Var != null) {
                ja0Var.b(false);
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
            ja0 ja0Var = this.V;
            if (ja0Var != null) {
                ja0Var.b(false);
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

    /* JADX WARN: Code restructure failed: missing block: B:223:0x071c, code lost:
    
        if (r18.toLowerCase().startsWith(r0) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x072f, code lost:
    
        if (r14.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x073f, code lost:
    
        if (r15.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06d0, code lost:
    
        if (r13.user_id == r11.id) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03eb, code lost:
    
        if (r10 != ':') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0407, code lost:
    
        if (r26.v != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0409, code lost:
    
        if (r13 == 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x040b, code lost:
    
        r26.Z = r7;
        r26.c0 = r3;
        r26.d0 = r0;
        r12.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0415, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x04bc, code lost:
    
        r26.X = r13;
        r26.Y = r14.length() + r15;
        r11 = 0;
        r13 = -1;
        r15 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0465, code lost:
    
        r13 = -1;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071f  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v39, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v44, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.Components.ja0] */
    /* JADX WARN: Type inference failed for: r26v0, types: [hg.k1, java.lang.Object, s4.h0] */
    /* JADX WARN: Type inference failed for: r3v25, types: [hg.i1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [a0.i, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        int i11;
        ArrayList arrayList2;
        char c10;
        String str3;
        co coVar;
        char c11;
        int i12;
        String str4;
        String str5;
        boolean z12;
        char c12;
        int i13;
        ?? r11;
        boolean z13;
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
        boolean z14;
        TLRPC.Chat chat3;
        ArrayList arrayList4;
        String str10;
        char c13;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat4 = this.l0;
        co coVar2 = this.G0;
        if (coVar2 != null) {
            chat4 = coVar2.e;
            coVar2.i();
        }
        TLRPC.Chat chat5 = chat4;
        t tVar = this.p0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.p0 = null;
        }
        if (this.j0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.j0, true);
            this.j0 = 0;
        }
        f1 f1Var = this.E;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            this.E = null;
        }
        v0 v0Var = this.F0;
        if (v0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v0Var);
            this.F0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ?? r12 = this.V;
        if (isEmpty || charSequence2.length() > MessagesController.getInstance(this.f).getMaxMessageLength()) {
            S(null, null);
            r12.a(false);
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
            g1 g1Var = this.n0;
            if (g1Var != null) {
                g1Var.a();
                return;
            }
            return;
        }
        int i15 = charSequence2.length() > 0 ? i10 - 1 : i10;
        this.Z = null;
        this.b0 = z10;
        this.a0 = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z15 = !z10 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z15) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            int i16 = 0;
            while (i16 < length) {
                char charAt = charSequence3.charAt(i16);
                int i17 = length - 1;
                if (i16 < i17) {
                    str10 = str11;
                    c13 = charSequence3.charAt(i16 + 1);
                } else {
                    str10 = str11;
                    c13 = 0;
                }
                if (i16 < i17 && charAt == 55356 && c13 >= 57339 && c13 <= 57343) {
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
        boolean z16 = z15 && (Emoji.isValidEmoji(str2) || Emoji.isValidEmoji(this.D0));
        if (z16 && (charSequence instanceof Spanned)) {
            z5[] z5VarArr = (z5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), z5.class);
            z16 = z5VarArr == null || z5VarArr.length == 0;
        }
        if (this.c && z16 && (chat5 == null || ChatObject.canSendStickers(chat5))) {
            ArrayList arrayList5 = this.C0;
            arrayList5.clear();
            int i18 = SharedConfig.suggestStickers;
            if (i18 == 2 || !z16) {
                if (this.o0 && i18 == 2) {
                    this.o0 = false;
                    r12.a(false);
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
            boolean z17 = MessagesController.getInstance(this.f).suggestStickersApiOnly;
            if (z17) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i11 = i10;
            } else {
                arrayList4 = arrayList5;
                i11 = i10;
                arrayList2 = arrayList;
                this.F0 = new v0((k1) this, charSequence, i11, arrayList, z10, z11);
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
            if (SharedConfig.suggestStickers == 0 || z17) {
                String str12 = this.D0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.E0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new bi.m1(11, this, str12));
            }
            ArrayList arrayList8 = this.A0;
            if (arrayList8 != null && !arrayList8.isEmpty()) {
                if (SharedConfig.suggestStickers != 0 || this.A0.size() >= 5) {
                    H();
                    r12.a(arrayList4.isEmpty());
                    this.o0 = true;
                } else {
                    r12.a(false);
                    this.o0 = false;
                }
                l();
            } else if (this.o0) {
                r12.a(false);
                this.o0 = false;
            }
            c10 = ' ';
            c11 = 4;
            str3 = null;
        } else {
            i11 = i10;
            arrayList2 = arrayList;
            if (!z10 && this.f0 && charSequence2.charAt(0) == '@') {
                c10 = ' ';
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str5 = charSequence2.substring(indexOf + 1);
                    str4 = substring;
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
            } else {
                c10 = ' ';
                if (!this.c || (coVar = this.G0) == null || coVar.h != null || (!(chat5 == null || ChatObject.canSendStickers(chat5)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                    str3 = null;
                    S(null, null);
                } else {
                    str3 = null;
                    S(null, null);
                }
            }
            c11 = 65535;
        }
        if (this.w0 != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.f);
        String str13 = this.F;
        this.F = str3;
        b2 b2Var = this.w;
        if (z10) {
            sb2.append(charSequence2.substring(1));
            this.X = 0;
            this.Y = sb2.length();
            z13 = false;
            i15 = -1;
        } else {
            while (true) {
                if (i15 < 0) {
                    z12 = false;
                    c12 = c11;
                    break;
                }
                if (i15 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i15);
                    if (i15 != 0) {
                        int i24 = i15 - 1;
                        if (charSequence2.charAt(i24) != c10) {
                            if (charSequence2.charAt(i24) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z18 = this.m0;
                        if (z18 || this.e0 || (this.f0 && i15 == 0)) {
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (ChatObject.isChannelAndNotMegaGroup(chat5) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat5))) {
                            String substring2 = charSequence2.substring(i15);
                            this.F = substring2;
                            if (substring2.length() < 4 || !this.F.matches("^[#$][\\p{L}_-]+$")) {
                                this.F = null;
                            }
                        }
                        if (!b2Var.s) {
                            MessagesStorage.getInstance(b2Var.m).getStorageQueue().postRunnable(new y1(b2Var, 1));
                            this.Z = charSequence2;
                            this.c0 = i11;
                            this.d0 = arrayList2;
                            return;
                        }
                        this.X = i15;
                        c12 = 1;
                        this.Y = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                        z12 = false;
                    } else if (i15 != 0 || this.W == null || charAt3 != '/') {
                        if (charAt3 == ':' && sb2.length() > 0) {
                            if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                i13 = 1;
                                if (sb2.length() > 1) {
                                    break;
                                }
                            } else {
                                i13 = 1;
                                break;
                            }
                        }
                    } else {
                        this.X = i15;
                        this.Y = sb2.length() + 1;
                        r11 = 0;
                        i15 = -1;
                        c12 = 2;
                        break;
                    }
                    sb2.insert(0, charAt3);
                }
                i15--;
            }
            this.X = i15;
            this.Y = sb2.length() + 1;
            z13 = false;
        }
        c12 = 0;
        r11 = z13;
        if (str13 == null && this.F != null) {
            s(r11, 2);
        } else if (str13 == null || this.F != null) {
            ?? r32 = this.G;
            if (r32 != 0) {
                r32.a(r11, this.F, chat5);
            }
            i1 i1Var = this.H;
            if (i1Var != null) {
                i1Var.a(1, this.F, chat5);
            }
        } else {
            t(r11, 2);
        }
        if (c12 == 65535) {
            this.x0 = r11;
            this.R = null;
            r12.a(r11);
            return;
        }
        if (c12 != 0) {
            if (c12 == 1) {
                ArrayList arrayList9 = new ArrayList();
                String lowerCase = sb2.toString().toLowerCase();
                ArrayList arrayList10 = b2Var.q;
                for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                    z1 z1Var = (z1) arrayList10.get(i25);
                    if (z1Var != null && (str7 = z1Var.a) != null && str7.startsWith(lowerCase)) {
                        arrayList9.add(z1Var.a);
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
                r12.a((this.I.isEmpty() && this.F == null) ? false : true);
                return;
            }
            if (c12 != 2) {
                if (c12 == 3) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(currentKeyboardLanguage, this.O)) {
                        MediaDataController.getInstance(this.f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    this.O = currentKeyboardLanguage;
                    MediaDataController.getInstance(this.f).getEmojiSuggestions(this.O, sb2.toString(), false, new w0(this), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(this.f).isPremium());
                    return;
                }
                if (c12 == 4) {
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
                co coVar3 = this.G0;
                if (coVar3.R3 == 0 && coVar3.i() != null && !this.G0.i().bot && !UserObject.isReplyUser(this.G0.i()) && !UserObject.isService(this.G0.i().id)) {
                    ig.b2 f7 = ig.b2.f(this.f);
                    ArrayList arrayList15 = f7.b;
                    f7.h();
                    this.L = lowerCase2;
                    this.M = new ArrayList();
                    for (int i28 = 0; i28 < arrayList15.size(); i28++) {
                        ig.a2 a2Var = (ig.a2) arrayList15.get(i28);
                        if (!ig.b2.g(a2Var.b)) {
                            String lowerCase3 = a2Var.b.toLowerCase();
                            if (lowerCase3.startsWith(lowerCase2) || AndroidUtilities.translitSafe(lowerCase3).startsWith(lowerCase2)) {
                                this.M.add(a2Var);
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
                    r12.a(arrayList11.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
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
            r12.a(arrayList11.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
            return;
        }
        this.x0 = r11;
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
        boolean z19 = lowerCase4.indexOf(c10) >= 0;
        ArrayList arrayList17 = new ArrayList();
        a0.i iVar = new a0.i();
        a0.i iVar2 = new a0.i();
        ArrayList arrayList18 = new ArrayList();
        arrayList18.addAll(MediaDataController.getInstance(this.f).inlineBots);
        if (chat5 == null || (!ChatObject.isMonoForum(chat5) && !ChatObject.isChannelAndNotMegaGroup(chat5))) {
            arrayList18.addAll(MediaDataController.getInstance(this.f).guestBots);
        }
        List.-EL.sort(arrayList18, new a4.e(15));
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
        co coVar4 = this.G0;
        if (coVar4 != null) {
            chat5 = coVar4.e;
            j3 = coVar4.d4;
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
                                if (!z14) {
                                }
                            }
                        }
                        z14 = z19;
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
                                if (!z14) {
                                }
                            } else {
                                arrayList17.add(user2);
                            }
                        }
                        z14 = z19;
                        chat2 = currentUser;
                    }
                } else if (currentUser == null || !z10) {
                    z14 = z19;
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
                        z14 = z19;
                    } else {
                        z14 = z19;
                    }
                    if (!TextUtils.isEmpty(str8)) {
                    }
                    if (!TextUtils.isEmpty(str9)) {
                    }
                    if (!z14) {
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
                z19 = z14;
            }
        }
        boolean z20 = z19;
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
                            if ((!TextUtils.isEmpty(publicUsername3) && publicUsername3.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z20 && ContactsController.formatName(str16, str17).toLowerCase().startsWith(lowerCase4))))) {
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
            t tVar2 = new t(this, arrayList17, iVar2, 2);
            this.p0 = tVar2;
            AndroidUtilities.runOnUIThread(tVar2, 1000L);
        } else {
            Y(iVar2, arrayList17, true);
        }
        f1 f1Var2 = new f1(this, chat5, lowerCase4, j12, arrayList17, iVar2, messagesController);
        this.E = f1Var2;
        AndroidUtilities.runOnUIThread(f1Var2, 200L);
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        co coVar;
        TLRPC.Chat chat;
        this.f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.h0 && this.w0 != null && (coVar = this.G0) != null && (chat = coVar.e) != null) {
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

    public final void X(co coVar) {
        this.G0 = coVar;
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
        t tVar = this.p0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
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
        ja0 ja0Var = this.V;
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
                        if (!(obj instanceof ig.a2)) {
                            if (obj != obj2 && ((!(obj instanceof j1) || !(obj2 instanceof j1) || ((j1) obj).a != ((j1) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
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
            if (z10 && ja0Var != null) {
                ja0Var.c();
            }
            this.J0 = objArr;
            return;
        }
        if (ja0Var != null) {
            this.L0 = K();
            ja0Var.c();
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
        co coVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f7;
        String str = this.F;
        int i11 = str != null ? i10 - 2 : i10;
        int i12 = c1Var.f;
        View view = c1Var.a;
        Boolean bool = null;
        if (i12 == 4) {
            d8 d8Var = (d8) view;
            if (i11 < 0 || i11 >= this.A0.size()) {
                return;
            }
            j1 j1Var = (j1) this.A0.get(i11);
            TLRPC.Document document = j1Var.a;
            Object obj = j1Var.b;
            sg.e1 e1Var = d8Var.n;
            x9 x9Var = d8Var.a;
            d8Var.c = obj;
            boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
            d8Var.s = isPremiumSticker;
            if (isPremiumSticker) {
                e1Var.setColor(j6.w0(null, j6.d6, false));
                e1Var.H = true;
                e1Var.I = false;
                e1Var.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.a7, 1.0f, 1.0f, d8Var.v);
            if (!MessageObject.canAutoplayAnimatedSticker(document)) {
                f7 = 1.0f;
                if (svgThumb == null) {
                    x9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, d8Var.c);
                } else if (closestPhotoSizeWithSize != null) {
                    x9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, d8Var.c);
                } else {
                    x9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, d8Var.c);
                }
            } else if (svgThumb != null) {
                x9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, d8Var.c);
                f7 = 1.0f;
            } else if (closestPhotoSizeWithSize != null) {
                f7 = 1.0f;
                x9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, d8Var.c);
            } else {
                f7 = 1.0f;
                x9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, d8Var.c);
            }
            d8Var.b = document;
            Drawable background = d8Var.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Be, false), PorterDuff.Mode.MULTIPLY));
            }
            if (d8Var.s) {
                d8Var.r = true;
            } else {
                d8Var.r = false;
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
            AndroidUtilities.updateViewVisibilityAnimated(e1Var, d8Var.r, 0.9f, false);
            d8Var.invalidate();
            d8Var.setClearsInputField(true);
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
            ig.x1 x1Var = (ig.x1) view;
            ArrayList arrayList = this.M;
            if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            x1Var.a((ig.a2) this.M.get(i11), this.L, false);
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
            i1 i1Var = (i1) view;
            int i13 = i11 + 2;
            if (i13 == 0) {
                this.G = i1Var;
            } else {
                this.H = i1Var;
            }
            TLRPC.Chat chat2 = this.l0;
            if (chat2 == null && (coVar = this.G0) != null) {
                chat2 = coVar.e;
            }
            i1Var.a(i13, str, chat2);
            return;
        }
        if (i12 == 7) {
            return;
        }
        g5 g5Var = (g5) view;
        ArrayList arrayList3 = this.x;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i11);
            if (tLObject instanceof TLRPC.User) {
                g5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                g5Var.setChat((TLRPC.Chat) tLObject);
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
                        c4 c4Var = g5Var.b;
                        TextView textView2 = g5Var.c;
                        i9 i9Var = g5Var.d;
                        x9 x9Var2 = g5Var.a;
                        g5Var.a();
                        if (user != null) {
                            x9Var2.setVisibility(0);
                            i9Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                x9Var2.setImageDrawable(i9Var);
                            } else {
                                x9Var2.e(user, i9Var);
                            }
                        } else {
                            x9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            nq nqVar = new nq(R.drawable.mini_ephemeral_hidden_14, 0);
                            nqVar.setColorKey(j6.A6);
                            nqVar.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            c4Var.setText(spannableStringBuilder);
                        } else {
                            c4Var.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    g5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.N.get(i11));
                }
            } else {
                g5Var.setText((String) this.I.get(i11));
            }
        }
        g5Var.setDivider(false);
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
                    i0Var.addView(textView, x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
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
                        view2 = new i1(context, f6Var, z10);
                    } else if (i10 != 7) {
                        d8 d8Var = new d8(context);
                        d8Var.v = f6Var;
                        x9 x9Var = new x9(context);
                        d8Var.a = x9Var;
                        x9Var.setAspectFit(true);
                        x9Var.setLayerNum(1);
                        d8Var.addView(x9Var, x5.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        d8Var.setFocusable(true);
                        sg.e1 e1Var = new sg.e1(context, 1, null);
                        d8Var.n = e1Var;
                        e1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        e1Var.setImageReceiver(x9Var.getImageReceiver());
                        d8Var.addView(e1Var, x5.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = d8Var;
                    } else {
                        View jnVar = new jn(context, 6);
                        oq oqVar = new oq(new ColorDrawable(z10 ? j6.l1(0.15f, -1) : j6.v0(j6.a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.b7, f6Var)), 0, 0);
                        oqVar.w = true;
                        jnVar.setBackground(oqVar);
                        view = jnVar;
                    }
                } else {
                    view = new ig.x1(context, f6Var, false);
                }
            } else {
                org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context);
                e2Var.setDelegate(new w0(this));
                view2 = e2Var;
            }
            return new vk0(view2);
        }
        g5 g5Var = new g5(context, f6Var);
        g5Var.setIsDarkTheme(false);
        view = g5Var;
        view2 = view;
        return new vk0(view2);
    }
}
