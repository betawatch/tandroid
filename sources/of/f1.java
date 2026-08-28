package of;

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
import g7.e6;
import ih.h3;
import ih.v3;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f1 extends vk0 implements NotificationCenter.NotificationCenterDelegate {
    public a1 A;
    public int A0;
    public String B;
    public r0 B0;
    public d1 C;
    public qn C0;
    public d1 D;
    public final b6 D0;
    public ArrayList E;
    public ArrayList F;
    public Object[] F0;
    public ArrayList G;
    public String H;
    public ArrayList I;
    public ArrayList J;
    public String[] K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public long O;
    public TLRPC.TL_inlineBotSwitchPM P;
    public TLRPC.TL_inlineBotWebView Q;
    public final r90 R;
    public a0.h S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public int Y;
    public ArrayList Z;
    public int c0;
    public int e0;
    public int f0;
    public boolean g0;
    public final Context h;
    public TLRPC.Chat h0;
    public b1 j0;
    public boolean k0;
    public h3 l0;
    public String m0;
    public long n;
    public String n0;
    public String o0;
    public int p0;
    public int q0;
    public final long r;
    public boolean r0;
    public final boolean s;
    public TLRPC.User s0;
    public boolean t0;
    public x0 u0;
    public TLRPC.ChatFull v;
    public Location v0;
    public final v1 w;
    public ArrayList w0;
    public ArrayList x;
    public HashMap x0;
    public a0.h y;
    public String z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = UserConfig.selectedAccount;
    public boolean a0 = true;
    public boolean b0 = true;
    public boolean d0 = true;
    public boolean i0 = false;
    public final ArrayList y0 = new ArrayList();
    public final w0 E0 = new w0(this, new v0(this));
    public boolean G0 = false;
    public int H0 = -1;

    public f1(Context context, long j10, long j11, r90 r90Var, b6 b6Var, boolean z10) {
        this.D0 = b6Var;
        this.h = context;
        this.R = r90Var;
        this.n = j10;
        this.s = z10;
        this.r = j11;
        v1 v1Var = new v1(true);
        this.w = v1Var;
        v1Var.a = new n2.p(this, 6);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i9++;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return (this.s0 == null || this.d0) && this.w0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.x0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.w0 == null) {
                    this.w0 = new ArrayList();
                    this.x0 = new HashMap();
                }
                this.w0.add(new e1(document, str));
                this.x0.put(str2, document);
                b1 b1Var = this.j0;
                if (b1Var != null) {
                    b1Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i9 = 0;
        Object obj = str;
        while (i9 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.x0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (UserConfig.getInstance(this.f).isPremium() || !MessageObject.isPremiumSticker(document))) {
                int size2 = document.attributes.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i10++;
                }
                if (this.w0 == null) {
                    this.w0 = new ArrayList();
                    this.x0 = new HashMap();
                }
                this.w0.add(new e1(document, obj));
                this.x0.put(str2, document);
            }
            i9++;
            obj = obj;
        }
    }

    public final void G() {
        qn qnVar = this.C0;
        if (qnVar == null || qnVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.C0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.C0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.E0.start();
    }

    public final void H() {
        if (this.w0 == null) {
            return;
        }
        ArrayList arrayList = this.y0;
        arrayList.clear();
        int min = Math.min(6, this.w0.size());
        for (int i9 = 0; i9 < min; i9++) {
            e1 e1Var = (e1) this.w0.get(i9);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e1Var.a.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.f).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                arrayList.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.f).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, e1Var.a), e1Var.b, "webp", 1, 1);
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.s0;
        if (user == null || user.id == this.O) {
            return this.P;
        }
        return null;
    }

    public final Object J(int i9) {
        String str;
        TLRPC.User user = null;
        if (this.B != null) {
            if (i9 >= 2) {
                i9 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.w0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.Q;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i9 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i9 >= 0 && i9 < arrayList2.size()) {
                        return this.N.get(i9);
                    }
                } else if (i9 == 0) {
                    return tL_inlineBotWebView;
                }
                i9--;
                if (i9 >= 0) {
                    return this.N.get(i9);
                }
            } else {
                ArrayList arrayList3 = this.x;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.J;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.I;
                            if (arrayList6 != null || this.F != null) {
                                if (arrayList6 != null) {
                                    if (i9 >= 0 && i9 < arrayList6.size()) {
                                        return this.I.get(i9);
                                    }
                                    ArrayList arrayList7 = this.I;
                                    if (arrayList7 != null) {
                                        i9 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.F;
                                if (arrayList8 != null && i9 >= 0 && i9 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.L;
                                    if (arrayList9 == null || (this.c0 == 1 && !(this.v instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.F.get(i9);
                                    } else if (arrayList9.get(i9) != null) {
                                        user = (TLRPC.User) this.L.get(i9);
                                        str = String.format("%s@%s", this.F.get(i9), user != null ? UserObject.getPublicUsername(user) : "");
                                    } else {
                                        str = String.format("%s", this.F.get(i9));
                                    }
                                    ArrayList arrayList10 = this.M;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i9)).booleanValue()) {
                                        return str;
                                    }
                                    return new c1(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i9 >= 0 && i9 < arrayList5.size()) {
                            return this.J.get(i9);
                        }
                    } else if (i9 >= 0 && i9 < arrayList4.size()) {
                        return this.E.get(i9);
                    }
                } else if (i9 >= 0 && i9 < arrayList3.size()) {
                    return this.x.get(i9);
                }
            }
        } else if (i9 >= 0 && i9 < arrayList.size()) {
            return ((e1) this.w0.get(i9)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i9 = 1;
        if (this.s0 != null && !this.d0) {
            return 1;
        }
        int i10 = this.B != null ? 2 : 0;
        ArrayList arrayList = this.w0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.N;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.P == null && this.Q == null) {
                    i9 = 0;
                }
                return size2 + i9 + i10;
            }
            ArrayList arrayList3 = this.x;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.E;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.F == null && this.I == null) {
                    ArrayList arrayList5 = this.J;
                    if (arrayList5 == null) {
                        return i10;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.I;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.F;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i10;
    }

    public final Object L(int i9) {
        if (this.B != null) {
            if (i9 < 2) {
                return null;
            }
            i9 -= 2;
        }
        ArrayList arrayList = this.w0;
        if (arrayList == null || i9 < 0 || i9 >= arrayList.size()) {
            return null;
        }
        return ((e1) this.w0.get(i9)).b;
    }

    public final int M(int i9) {
        if (this.B != null) {
            if (i9 < 2) {
                return 0;
            }
            i9 -= 2;
        }
        return this.N != null ? (this.P == null && this.Q == null) ? i9 : i9 - 1 : i9;
    }

    public final boolean N() {
        return this.w0 != null;
    }

    public final void P() {
        w0 w0Var = this.E0;
        if (w0Var != null) {
            w0Var.stop();
        }
        x0 x0Var = this.u0;
        if (x0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x0Var);
            this.u0 = null;
        }
        if (this.p0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.p0, true);
            this.p0 = 0;
        }
        if (this.q0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
            this.q0 = 0;
        }
        this.s0 = null;
        this.P = null;
        this.d0 = true;
        this.m0 = null;
        this.n0 = null;
        this.r0 = false;
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.f).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public final void Q() {
        TLRPC.User user = this.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.v0 = location;
        location.setLatitude(-1000.0d);
        this.v0.setLongitude(-1000.0d);
        T(true, this.s0, this.n0, "");
    }

    public final void R(TLRPC.User user) {
        qn qnVar;
        TLRPC.Chat chat;
        this.p0 = 0;
        this.E0.stop();
        r90 r90Var = this.R;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.s0 = null;
            this.P = null;
            this.d0 = true;
        } else {
            this.s0 = user;
            long j10 = user.id;
            if (j10 != this.O) {
                this.P = null;
                this.O = j10;
            }
            qn qnVar2 = this.C0;
            if (qnVar2 != null && (chat = qnVar2.e) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(chat);
                this.d0 = canSendStickers;
                if (!canSendStickers) {
                    l();
                    r90Var.a(true);
                    return;
                }
            }
            if (this.s0.bot_inline_geo) {
                if (MessagesController.getNotificationsSettings(this.f).getBoolean("inlinegeo_" + this.s0.id, false) || (qnVar = this.C0) == null || qnVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.s0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.C0.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString(R.string.ShareYouLocationTitle);
                    alertDialog$Builder.a.P = LocaleController.getString(R.string.ShareYouLocationInline);
                    boolean[] zArr = new boolean[1];
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(this, zArr, user2, 14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v3(6, this, zArr));
                    this.C0.showDialog(alertDialog$Builder.a, new bg.j(4, this, zArr));
                }
            }
        }
        if (this.s0 == null) {
            this.r0 = true;
            this.P = null;
        } else {
            if (r90Var != null) {
                r90Var.b(true);
            }
            T(true, this.s0, this.n0, "");
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
        TLRPC.User user = this.s0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.n0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.s0;
            r90 r90Var = this.R;
            if (user2 != null) {
                if (!this.d0 && str != null && str2 != null) {
                    return;
                } else {
                    r90Var.a(false);
                }
            }
            x0 x0Var = this.u0;
            if (x0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(x0Var);
                this.u0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.m0) != null && !str3.equals(str))) {
                if (this.p0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.p0, true);
                    this.p0 = 0;
                }
                if (this.q0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
                    this.q0 = 0;
                }
                this.s0 = null;
                this.P = null;
                this.d0 = true;
                this.m0 = null;
                this.n0 = null;
                this.E0.stop();
                this.r0 = false;
                if (r90Var != null) {
                    r90Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (r90Var != null) {
                    if (this.s0 != null) {
                        r90Var.b(true);
                    } else if (str.equals("gif")) {
                        this.m0 = "gif";
                        r90Var.b(false);
                    }
                }
                MessagesController messagesController = MessagesController.getInstance(this.f);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
                this.n0 = str2;
                x0 x0Var2 = new x0(this, str2, str, messagesController, messagesStorage);
                this.u0 = x0Var2;
                AndroidUtilities.runOnUIThread(x0Var2, 400L);
                return;
            }
            if (this.q0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
                this.q0 = 0;
            }
            this.n0 = null;
            if (r90Var != null) {
                r90Var.b(false);
            }
        }
    }

    public final void T(boolean z10, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.q0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.q0, true);
            this.q0 = 0;
        }
        if (!this.d0 || !this.d) {
            r90 r90Var = this.R;
            if (r90Var != null) {
                r90Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.n0 = null;
            return;
        }
        if (user.bot_inline_geo && this.v0 == null) {
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
        sb2.append((!user.bot_inline_geo || this.v0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.v0.getLongitude() + this.v0.getLatitude()));
        String sb3 = sb2.toString();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.f);
        t0 t0Var = new t0(this, str, z10, user, str2, messagesStorage, sb3);
        long j10 = user.id;
        if (j10 != this.O) {
            this.P = null;
            this.O = j10;
        }
        if (z10) {
            messagesStorage.getBotCache(sb3, t0Var);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.f).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.v0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.v0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.v0.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.f).getInputPeer(this.n);
        }
        this.q0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, t0Var, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x071b, code lost:
    
        if (r17.toLowerCase().startsWith(r0) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x072e, code lost:
    
        if (r14.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x073e, code lost:
    
        if (r15.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06cf, code lost:
    
        if (r13.user_id == r11.id) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03eb, code lost:
    
        if (r10 != ':') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0407, code lost:
    
        if (r27.v != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0409, code lost:
    
        if (r13 == 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x040b, code lost:
    
        r27.V = r7;
        r27.Y = r3;
        r27.Z = r0;
        r12.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0415, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x04bc, code lost:
    
        r27.T = r13;
        r27.U = r14.length() + r15;
        r11 = 0;
        r13 = -1;
        r15 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0465, code lost:
    
        r13 = -1;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071e  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v39, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v44, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.Components.r90] */
    /* JADX WARN: Type inference failed for: r27v0, types: [f2.r0, java.lang.Object, of.f1] */
    /* JADX WARN: Type inference failed for: r3v25, types: [of.d1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i9, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        int i10;
        ArrayList arrayList2;
        char c10;
        String str3;
        qn qnVar;
        char c11;
        int i11;
        String str4;
        String str5;
        boolean z12;
        char c12;
        int i12;
        ?? r11;
        boolean z13;
        ?? r62;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j10;
        TLRPC.Chat chat;
        TLRPC.ChatFull chatFull;
        int i13;
        long j11;
        String str8;
        String publicUsername;
        String str9;
        TLRPC.Chat chat2;
        long j12;
        boolean z14;
        TLRPC.Chat chat3;
        ArrayList arrayList4;
        String str10;
        char c13;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat4 = this.h0;
        qn qnVar2 = this.C0;
        if (qnVar2 != null) {
            chat4 = qnVar2.e;
            qnVar2.i();
        }
        TLRPC.Chat chat5 = chat4;
        h3 h3Var = this.l0;
        if (h3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h3Var);
            this.l0 = null;
        }
        if (this.f0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.f0, true);
            this.f0 = 0;
        }
        a1 a1Var = this.A;
        if (a1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            this.A = null;
        }
        r0 r0Var = this.B0;
        if (r0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            this.B0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ?? r12 = this.R;
        if (isEmpty || charSequence2.length() > MessagesController.getInstance(this.f).getMaxMessageLength()) {
            S(null, null);
            r12.a(false);
            this.V = null;
            this.z0 = null;
            this.w0 = null;
            this.x0 = null;
            l();
            this.k0 = false;
            if (this.A0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.A0, true);
                this.A0 = 0;
            }
            b1 b1Var = this.j0;
            if (b1Var != null) {
                b1Var.a();
                return;
            }
            return;
        }
        int i14 = charSequence2.length() > 0 ? i9 - 1 : i9;
        this.V = null;
        this.X = z10;
        this.W = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z15 = !z10 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z15) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            int i15 = 0;
            while (i15 < length) {
                char charAt = charSequence3.charAt(i15);
                int i16 = length - 1;
                if (i15 < i16) {
                    str10 = str11;
                    c13 = charSequence3.charAt(i15 + 1);
                } else {
                    str10 = str11;
                    c13 = 0;
                }
                if (i15 < i16 && charAt == 55356 && c13 >= 57339 && c13 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i15), charSequence3.subSequence(i15 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i15), charSequence3.subSequence(i15 + 1, charSequence3.length()));
                    length--;
                } else {
                    i15++;
                    str11 = str10;
                }
                i15--;
                i15++;
                str11 = str10;
            }
            str = str11;
            this.z0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            str2 = str;
        }
        boolean z16 = z15 && (Emoji.isValidEmoji(str2) || Emoji.isValidEmoji(this.z0));
        if (z16 && (charSequence instanceof Spanned)) {
            t5[] t5VarArr = (t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), t5.class);
            z16 = t5VarArr == null || t5VarArr.length == 0;
        }
        if (this.c && z16 && (chat5 == null || ChatObject.canSendStickers(chat5))) {
            ArrayList arrayList5 = this.y0;
            arrayList5.clear();
            int i17 = SharedConfig.suggestStickers;
            if (i17 == 2 || !z16) {
                if (this.k0 && i17 == 2) {
                    this.k0 = false;
                    r12.a(false);
                    l();
                    return;
                }
                return;
            }
            this.w0 = null;
            this.x0 = null;
            if (this.A0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.A0, true);
                this.A0 = 0;
            }
            boolean z17 = MessagesController.getInstance(this.f).suggestStickersApiOnly;
            if (z17) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i10 = i9;
            } else {
                arrayList4 = arrayList5;
                i10 = i9;
                arrayList2 = arrayList;
                this.B0 = new r0((f1) this, charSequence, i10, arrayList, z10, z11);
                MediaDataController.getInstance(this.f).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.f).loadRecents(2, false, true, false);
                ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(0);
                ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.f).getRecentStickersNoCopy(2);
                int min = Math.min(20, recentStickersNoCopy.size());
                int i18 = 0;
                for (int i19 = 0; i19 < min; i19++) {
                    TLRPC.Document document = recentStickersNoCopy.get(i19);
                    if (O(document, this.z0)) {
                        E(document, "recent");
                        int i20 = i18 + 1;
                        if (i20 >= 5) {
                            break;
                        } else {
                            i18 = i20;
                        }
                    }
                }
                int size = recentStickersNoCopy2.size();
                for (int i21 = 0; i21 < size; i21++) {
                    TLRPC.Document document2 = recentStickersNoCopy2.get(i21);
                    if (O(document2, this.z0)) {
                        E(document2, "fav");
                    }
                }
                MediaDataController.getInstance(this.f).checkStickers(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.f).getAllStickers();
                ArrayList<TLRPC.Document> arrayList6 = allStickers != null ? allStickers.get(this.z0) : null;
                if (arrayList6 != null && !arrayList6.isEmpty()) {
                    F(null, arrayList6);
                }
                ArrayList arrayList7 = this.w0;
                if (arrayList7 != null) {
                    Collections.sort(arrayList7, new y0(recentStickersNoCopy2, recentStickersNoCopy));
                }
            }
            if (SharedConfig.suggestStickers == 0 || z17) {
                String str12 = this.z0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.A0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new bg.j0(21, (Object) this, str12));
            }
            ArrayList arrayList8 = this.w0;
            if (arrayList8 != null && !arrayList8.isEmpty()) {
                if (SharedConfig.suggestStickers != 0 || this.w0.size() >= 5) {
                    H();
                    r12.a(arrayList4.isEmpty());
                    this.k0 = true;
                } else {
                    r12.a(false);
                    this.k0 = false;
                }
                l();
            } else if (this.k0) {
                r12.a(false);
                this.k0 = false;
            }
            c10 = ' ';
            c11 = 4;
            str3 = null;
        } else {
            i10 = i9;
            arrayList2 = arrayList;
            if (!z10 && this.b0 && charSequence2.charAt(0) == '@') {
                c10 = ' ';
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str5 = charSequence2.substring(indexOf + 1);
                    str4 = substring;
                    i11 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i11 = 1;
                    str4 = charSequence2.substring(1);
                    str5 = str;
                } else {
                    i11 = 1;
                    S(null, null);
                    str4 = null;
                    str5 = null;
                }
                if (str4 != null && str4.length() >= i11) {
                    for (int i22 = 1; i22 < str4.length(); i22++) {
                        char charAt2 = str4.charAt(i22);
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
                if (!this.c || (qnVar = this.C0) == null || qnVar.h != null || (!(chat5 == null || ChatObject.canSendStickers(chat5)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                    str3 = null;
                    S(null, null);
                } else {
                    str3 = null;
                    S(null, null);
                }
            }
            c11 = 65535;
        }
        if (this.s0 != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.f);
        String str13 = this.B;
        this.B = str3;
        v1 v1Var = this.w;
        if (z10) {
            sb2.append(charSequence2.substring(1));
            this.T = 0;
            this.U = sb2.length();
            z13 = false;
            i14 = -1;
        } else {
            while (true) {
                if (i14 < 0) {
                    z12 = false;
                    c12 = c11;
                    break;
                }
                if (i14 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i14);
                    if (i14 != 0) {
                        int i23 = i14 - 1;
                        if (charSequence2.charAt(i23) != c10) {
                            if (charSequence2.charAt(i23) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z18 = this.i0;
                        if (z18 || this.a0 || (this.b0 && i14 == 0)) {
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (ChatObject.isChannelAndNotMegaGroup(chat5) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat5))) {
                            String substring2 = charSequence2.substring(i14);
                            this.B = substring2;
                            if (substring2.length() < 4 || !this.B.matches("^[#$][\\p{L}_-]+$")) {
                                this.B = null;
                            }
                        }
                        if (!v1Var.s) {
                            MessagesStorage.getInstance(v1Var.m).getStorageQueue().postRunnable(new s1(v1Var, 1));
                            this.V = charSequence2;
                            this.Y = i10;
                            this.Z = arrayList2;
                            return;
                        }
                        this.T = i14;
                        c12 = 1;
                        this.U = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                        z12 = false;
                    } else if (i14 != 0 || this.S == null || charAt3 != '/') {
                        if (charAt3 == ':' && sb2.length() > 0) {
                            if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                i12 = 1;
                                if (sb2.length() > 1) {
                                    break;
                                }
                            } else {
                                i12 = 1;
                                break;
                            }
                        }
                    } else {
                        this.T = i14;
                        this.U = sb2.length() + 1;
                        r11 = 0;
                        i14 = -1;
                        c12 = 2;
                        break;
                    }
                    sb2.insert(0, charAt3);
                }
                i14--;
            }
            this.T = i14;
            this.U = sb2.length() + 1;
            z13 = false;
        }
        c12 = 0;
        r11 = z13;
        if (str13 == null && this.B != null) {
            s(r11, 2);
        } else if (str13 == null || this.B != null) {
            ?? r32 = this.C;
            if (r32 != 0) {
                r32.a(r11, this.B, chat5);
            }
            d1 d1Var = this.D;
            if (d1Var != null) {
                d1Var.a(1, this.B, chat5);
            }
        } else {
            t(r11, 2);
        }
        if (c12 == 65535) {
            this.t0 = r11;
            this.N = null;
            r12.a(r11);
            return;
        }
        if (c12 != 0) {
            if (c12 == 1) {
                ArrayList arrayList9 = new ArrayList();
                String lowerCase = sb2.toString().toLowerCase();
                ArrayList arrayList10 = v1Var.q;
                for (int i24 = 0; i24 < arrayList10.size(); i24++) {
                    t1 t1Var = (t1) arrayList10.get(i24);
                    if (t1Var != null && (str7 = t1Var.a) != null && str7.startsWith(lowerCase)) {
                        arrayList9.add(t1Var.a);
                    }
                }
                this.E = arrayList9;
                this.w0 = null;
                this.x = null;
                this.y = null;
                this.I = null;
                this.F = null;
                this.M = null;
                this.G = null;
                this.L = null;
                this.J = null;
                this.t0 = false;
                this.N = null;
                l();
                r12.a((this.E.isEmpty() && this.B == null) ? false : true);
                return;
            }
            if (c12 != 2) {
                if (c12 == 3) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(currentKeyboardLanguage, this.K)) {
                        MediaDataController.getInstance(this.f).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    this.K = currentKeyboardLanguage;
                    MediaDataController.getInstance(this.f).getEmojiSuggestions(this.K, sb2.toString(), false, new s0(this), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(this.f).isPremium());
                    return;
                }
                if (c12 == 4) {
                    this.E = null;
                    this.x = null;
                    this.y = null;
                    this.J = null;
                    this.F = null;
                    this.M = null;
                    this.I = null;
                    this.G = null;
                    this.L = null;
                    return;
                }
                return;
            }
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            String lowerCase2 = sb2.toString().toLowerCase();
            for (int i25 = 0; i25 < this.S.m(); i25++) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.S.n(i25);
                for (int i26 = 0; i26 < botInfo.commands.size(); i26++) {
                    TLRPC.BotCommand botCommand = botInfo.commands.get(i26);
                    if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                        arrayList11.add("/" + botCommand.command);
                        arrayList12.add(botCommand.description);
                        arrayList13.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                        arrayList14.add(Boolean.valueOf(botCommand.ephemeral));
                    }
                }
            }
            if (this.C0 != null && !DialogObject.isEncryptedDialog(this.n)) {
                qn qnVar3 = this.C0;
                if (qnVar3.N3 == 0 && qnVar3.i() != null && !this.C0.i().bot && !UserObject.isReplyUser(this.C0.i()) && !UserObject.isService(this.C0.i().id)) {
                    pf.r1 f10 = pf.r1.f(this.f);
                    ArrayList arrayList15 = f10.b;
                    f10.h();
                    this.H = lowerCase2;
                    this.I = new ArrayList();
                    for (int i27 = 0; i27 < arrayList15.size(); i27++) {
                        pf.q1 q1Var = (pf.q1) arrayList15.get(i27);
                        if (!pf.r1.g(q1Var.b)) {
                            String lowerCase3 = q1Var.b.toLowerCase();
                            if (lowerCase3.startsWith(lowerCase2) || AndroidUtilities.translitSafe(lowerCase3).startsWith(lowerCase2)) {
                                this.I.add(q1Var);
                            }
                        }
                    }
                    r62 = 0;
                    this.E = r62;
                    this.w0 = r62;
                    this.x = r62;
                    this.y = r62;
                    this.J = r62;
                    this.F = arrayList11;
                    this.G = arrayList12;
                    this.L = arrayList13;
                    this.M = arrayList14;
                    this.t0 = false;
                    this.N = r62;
                    l();
                    r12.a(arrayList11.isEmpty() || !((arrayList3 = this.I) == null || arrayList3.isEmpty()));
                    return;
                }
            }
            r62 = 0;
            this.H = null;
            this.I = null;
            this.E = r62;
            this.w0 = r62;
            this.x = r62;
            this.y = r62;
            this.J = r62;
            this.F = arrayList11;
            this.G = arrayList12;
            this.L = arrayList13;
            this.M = arrayList14;
            this.t0 = false;
            this.N = r62;
            l();
            r12.a(arrayList11.isEmpty() || !((arrayList3 = this.I) == null || arrayList3.isEmpty()));
            return;
        }
        this.t0 = r11;
        this.N = null;
        ArrayList arrayList16 = new ArrayList();
        if (arrayList2 != null) {
            for (int i28 = 0; i28 < Math.min(100, arrayList2.size()); i28++) {
                long fromChatId = ((MessageObject) arrayList2.get(i28)).getFromChatId();
                if (fromChatId > 0 && !arrayList16.contains(Long.valueOf(fromChatId))) {
                    arrayList16.add(Long.valueOf(fromChatId));
                }
            }
        }
        String lowerCase4 = sb2.toString().toLowerCase();
        boolean z19 = lowerCase4.indexOf(c10) >= 0;
        ArrayList arrayList17 = new ArrayList();
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        ArrayList arrayList18 = new ArrayList();
        arrayList18.addAll(MediaDataController.getInstance(this.f).inlineBots);
        if (chat5 == null || (!ChatObject.isMonoForum(chat5) && !ChatObject.isChannelAndNotMegaGroup(chat5))) {
            arrayList18.addAll(MediaDataController.getInstance(this.f).guestBots);
        }
        List.-EL.sort(arrayList18, new j9.a(6));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList18.size();
        int i29 = 0;
        while (i29 < size2) {
            Object obj = arrayList18.get(i29);
            i29++;
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
            Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
        }
        ArrayList arrayList19 = new ArrayList(linkedHashMap.values());
        if (!z10 && this.b0 && i14 == 0 && !arrayList19.isEmpty()) {
            int i30 = 0;
            for (int i31 = 0; i31 < arrayList19.size(); i31++) {
                TLRPC.User user = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayList19.get(i31)).peer.user_id));
                if (user != null) {
                    String publicUsername2 = UserObject.getPublicUsername(user);
                    if (!TextUtils.isEmpty(publicUsername2) && (lowerCase4.length() == 0 || publicUsername2.toLowerCase().startsWith(lowerCase4))) {
                        arrayList17.add(user);
                        hVar.k(user, user.id);
                        hVar2.k(user, user.id);
                        i30++;
                    }
                    if (i30 == 5) {
                        break;
                    }
                }
            }
        }
        qn qnVar4 = this.C0;
        if (qnVar4 != null) {
            chat5 = qnVar4.e;
            j10 = qnVar4.Z3;
        } else {
            TLRPC.ChatFull chatFull2 = this.v;
            if (chatFull2 != null) {
                chat5 = messagesController.getChat(Long.valueOf(chatFull2.id));
            }
            j10 = 0;
        }
        ?? currentUser = UserConfig.getInstance(this.f).getCurrentUser();
        if (chat5 != null && (chatFull = this.v) != null && chatFull.participants != null && (!ChatObject.isChannel(chat5) || chat5.megagroup)) {
            int i32 = -2;
            int i33 = -2;
            while (i33 < this.v.participants.participants.size()) {
                if (i33 != i32) {
                    i13 = i33;
                    if (i13 == -1) {
                        if (z11) {
                            if (lowerCase4.length() == 0) {
                                arrayList17.add(chat5);
                            } else {
                                String str14 = chat5.title;
                                publicUsername = ChatObject.getPublicUsername(chat5);
                                j11 = j10;
                                chat3 = chat5;
                                chat2 = currentUser;
                                j12 = -chat5.id;
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
                        j11 = j10;
                        chat2 = currentUser;
                    } else {
                        TLRPC.ChatParticipant chatParticipant = this.v.participants.participants.get(i13);
                        if (currentUser != null) {
                            j11 = j10;
                        } else {
                            j11 = j10;
                        }
                        ?? user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                        if (user2 != 0 && !UserObject.isUserSelf(user2) && hVar.h(user2.id) < 0) {
                            if (lowerCase4.length() != 0 || user2.deleted) {
                                str8 = user2.first_name;
                                String str15 = user2.last_name;
                                publicUsername = UserObject.getPublicUsername(user2);
                                str9 = str15;
                                chat2 = currentUser;
                                j12 = user2.id;
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
                    j11 = j10;
                    i13 = i33;
                    chat2 = currentUser;
                } else {
                    str8 = currentUser.first_name;
                    str9 = currentUser.last_name;
                    publicUsername = UserObject.getPublicUsername(currentUser);
                    j11 = j10;
                    TLRPC.Chat chat6 = currentUser;
                    j12 = currentUser.id;
                    i13 = i33;
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
                        hVar2.k(chat3, j12);
                    }
                }
                int i34 = i13 + 1;
                j10 = j11;
                currentUser = chat2;
                i32 = -2;
                i33 = i34;
                z19 = z14;
            }
        }
        boolean z20 = z19;
        long j13 = j10;
        if (this.i0) {
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.f).getAllDialogs();
            for (int i35 = 0; i35 < allDialogs.size(); i35++) {
                if (allDialogs.get(i35).id > 0) {
                    TLRPC.User user3 = messagesController.getUser(Long.valueOf(allDialogs.get(i35).id));
                    if (user3 != null && !UserObject.isUserSelf(user3) && hVar.h(user3.id) < 0) {
                        if (lowerCase4.length() != 0 || user3.deleted) {
                            String str16 = user3.first_name;
                            String str17 = user3.last_name;
                            String publicUsername3 = UserObject.getPublicUsername(user3);
                            long j14 = user3.id;
                            if ((!TextUtils.isEmpty(publicUsername3) && publicUsername3.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z20 && ContactsController.formatName(str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                arrayList17.add(user3);
                                hVar2.k(user3, j14);
                            }
                        } else {
                            arrayList17.add(user3);
                        }
                    }
                } else if (!TextUtils.isEmpty(lowerCase4) && (chat = messagesController.getChat(Long.valueOf(-allDialogs.get(i35).id))) != null && chat.username != null && hVar.h(chat.id) < 0) {
                    if (lowerCase4.length() == 0) {
                        arrayList17.add(chat);
                    } else {
                        String str18 = chat.title;
                        String str19 = chat.username;
                        long j15 = chat.id;
                        if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                            arrayList17.add(chat);
                            hVar2.k(chat, j15);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList17, new z0(hVar2, arrayList16));
        this.E = null;
        this.w0 = null;
        this.I = null;
        this.F = null;
        this.M = null;
        this.G = null;
        this.L = null;
        this.J = null;
        if (((chat5 == null || !chat5.megagroup) && !this.i0) || lowerCase4.length() <= 0) {
            Y(hVar2, arrayList17, true);
            return;
        }
        if (arrayList17.size() < 5) {
            h3 h3Var2 = new h3(this, arrayList17, hVar2, 27);
            this.l0 = h3Var2;
            AndroidUtilities.runOnUIThread(h3Var2, 1000L);
        } else {
            Y(hVar2, arrayList17, true);
        }
        a1 a1Var2 = new a1(this, chat5, lowerCase4, j13, arrayList17, hVar2, messagesController);
        this.A = a1Var2;
        AndroidUtilities.runOnUIThread(a1Var2, 200L);
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        qn qnVar;
        TLRPC.Chat chat;
        this.f = UserConfig.selectedAccount;
        this.v = chatFull;
        if (!this.d0 && this.s0 != null && (qnVar = this.C0) != null && (chat = qnVar.e) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(chat);
            this.d0 = canSendStickers;
            if (canSendStickers) {
                this.x = null;
                l();
                this.R.a(false);
                R(this.s0);
            }
        }
        String str = this.V;
        if (str != null) {
            U(str, this.Y, this.Z, this.X, this.W);
        }
    }

    public final void X(qn qnVar) {
        this.C0 = qnVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
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
        this.y = hVar;
        h3 h3Var = this.l0;
        if (h3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h3Var);
            this.l0 = null;
        }
        this.N = null;
        this.w0 = null;
        if (z10) {
            l();
            this.R.a(!this.x.isEmpty());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        r0 r0Var;
        if (i9 == NotificationCenter.fileLoaded || i9 == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.w0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.y0;
            if (arrayList2.isEmpty() || !this.k0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.R.a(K() > 0);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.recentDocumentsDidLoad) {
            r0 r0Var2 = this.B0;
            if (r0Var2 != null) {
                AndroidUtilities.runOnUIThread(r0Var2);
                this.B0 = null;
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (r0Var = this.B0) != null) {
            AndroidUtilities.runOnUIThread(r0Var);
            this.B0 = null;
        }
    }

    @Override // f2.r0
    public final int h() {
        int K = K();
        this.H0 = K;
        return K;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (this.B != null) {
            if (i9 < 2) {
                return 6;
            }
            i9 -= 2;
        }
        if (this.w0 != null) {
            return 4;
        }
        if (this.s0 != null && !this.d0) {
            return 3;
        }
        if (this.N == null) {
            ArrayList arrayList = this.I;
            return (arrayList == null || i9 < 0 || i9 >= arrayList.size()) ? 0 : 5;
        }
        if (i9 == 0) {
            return (this.P == null && this.Q == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // f2.r0
    public final void l() {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        int i9 = this.H0;
        r90 r90Var = this.R;
        int i10 = 0;
        if (i9 != -1 && this.F0 != null) {
            int K = K();
            this.H0 = K;
            boolean z10 = i9 != K;
            int min = Math.min(i9, K);
            Object[] objArr = new Object[K];
            for (int i11 = 0; i11 < K; i11++) {
                objArr[i11] = J(i11);
            }
            while (i10 < min) {
                if (i10 >= 0) {
                    Object[] objArr2 = this.F0;
                    if (i10 < objArr2.length && i10 < K) {
                        Object obj = objArr2[i10];
                        Object obj2 = objArr[i10];
                        if (!(obj instanceof pf.q1)) {
                            if (obj != obj2 && ((!(obj instanceof e1) || !(obj2 instanceof e1) || ((e1) obj).a != ((e1) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
                                    MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
                                    if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                                    }
                                }
                            }
                            i10++;
                        }
                    }
                }
                m(i10);
                z10 = true;
                i10++;
            }
            t(min, i9 - min);
            s(min, K - min);
            if (z10 && r90Var != null) {
                r90Var.c();
            }
            this.F0 = objArr;
            return;
        }
        if (r90Var != null) {
            this.H0 = K();
            r90Var.c();
        }
        super.l();
        int K2 = K();
        this.H0 = K2;
        this.F0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.F0;
            if (i10 >= objArr3.length) {
                return;
            }
            objArr3[i10] = J(i10);
            i10++;
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        qn qnVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f10;
        String str = this.B;
        int i10 = str != null ? i9 - 2 : i9;
        int i11 = q1Var.f;
        View view = q1Var.a;
        Boolean bool = null;
        if (i11 == 4) {
            b8 b8Var = (b8) view;
            if (i10 < 0 || i10 >= this.w0.size()) {
                return;
            }
            e1 e1Var = (e1) this.w0.get(i10);
            TLRPC.Document document = e1Var.a;
            Object obj = e1Var.b;
            zf.b1 b1Var = b8Var.n;
            o9 o9Var = b8Var.a;
            b8Var.c = obj;
            boolean isPremiumSticker = MessageObject.isPremiumSticker(document);
            b8Var.s = isPremiumSticker;
            if (isPremiumSticker) {
                b1Var.setColor(f6.w0(null, f6.d6, false));
                b1Var.D = true;
                b1Var.E = false;
                b1Var.invalidate();
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, f6.a7, 1.0f, 1.0f, b8Var.v);
            if (!MessageObject.canAutoplayAnimatedSticker(document)) {
                f10 = 1.0f;
                if (svgThumb == null) {
                    o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", null, b8Var.c);
                } else if (closestPhotoSizeWithSize != null) {
                    o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, "webp", svgThumb, b8Var.c);
                } else {
                    o9Var.i(ImageLocation.getForDocument(document), null, "webp", svgThumb, b8Var.c);
                }
            } else if (svgThumb != null) {
                o9Var.i(ImageLocation.getForDocument(document), "80_80", null, svgThumb, b8Var.c);
                f10 = 1.0f;
            } else if (closestPhotoSizeWithSize != null) {
                f10 = 1.0f;
                o9Var.j(ImageLocation.getForDocument(document), "80_80", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, 0, b8Var.c);
            } else {
                f10 = 1.0f;
                o9Var.i(ImageLocation.getForDocument(document), "80_80", null, null, b8Var.c);
            }
            b8Var.b = document;
            Drawable background = b8Var.getBackground();
            if (background != null) {
                background.setAlpha(230);
                background.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.Be, false), PorterDuff.Mode.MULTIPLY));
            }
            if (b8Var.s) {
                b8Var.r = true;
            } else {
                b8Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                int dp = AndroidUtilities.dp(16.0f);
                layoutParams.width = dp;
                layoutParams.height = dp;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = AndroidUtilities.dp(8.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                b1Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            } else {
                int dp2 = AndroidUtilities.dp(24.0f);
                layoutParams.width = dp2;
                layoutParams.height = dp2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            b1Var.setLocked(!UserConfig.getInstance(UserConfig.selectedAccount).isPremium());
            AndroidUtilities.updateViewVisibilityAnimated(b1Var, b8Var.r, 0.9f, false);
            b8Var.invalidate();
            b8Var.setClearsInputField(true);
            return;
        }
        if (i11 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.C0.e;
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
        if (i11 == 5) {
            pf.m1 m1Var = (pf.m1) view;
            ArrayList arrayList = this.I;
            if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            m1Var.a((pf.q1) this.I.get(i10), this.H, false);
            return;
        }
        ArrayList arrayList2 = this.N;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.P;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.Q == null) ? false : true;
            if (i11 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.i0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.Q.text);
                    return;
                }
                return;
            } else {
                if (z10) {
                    i10--;
                }
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                ((e2) view).e((TLRPC.BotInlineResult) this.N.get(i10), this.s0, this.t0, i10 != this.N.size() - 1, z10 && i10 == 0, "gif".equals(this.m0));
                return;
            }
        }
        if (i11 == 6) {
            d1 d1Var = (d1) view;
            int i12 = i10 + 2;
            if (i12 == 0) {
                this.C = d1Var;
            } else {
                this.D = d1Var;
            }
            TLRPC.Chat chat2 = this.h0;
            if (chat2 == null && (qnVar = this.C0) != null) {
                chat2 = qnVar.e;
            }
            d1Var.a(i12, str, chat2);
            return;
        }
        if (i11 == 7) {
            return;
        }
        h5 h5Var = (h5) view;
        ArrayList arrayList3 = this.x;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i10);
            if (tLObject instanceof TLRPC.User) {
                h5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                h5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.E;
            if (arrayList4 == null || i10 < 0 || i10 >= arrayList4.size()) {
                ArrayList arrayList5 = this.J;
                if (arrayList5 == null || i10 < 0 || i10 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.F;
                    if (arrayList6 != null && i10 >= 0 && i10 < arrayList6.size()) {
                        ArrayList arrayList7 = this.G;
                        String str2 = (arrayList7 == null || i10 < 0 || i10 >= arrayList7.size()) ? null : (String) this.G.get(i10);
                        ArrayList arrayList8 = this.L;
                        TLRPC.User user = (arrayList8 == null || i10 < 0 || i10 >= arrayList8.size()) ? null : (TLRPC.User) this.L.get(i10);
                        ArrayList arrayList9 = this.M;
                        if (arrayList9 != null && i10 >= 0 && i10 < arrayList9.size()) {
                            bool = (Boolean) this.M.get(i10);
                        }
                        boolean booleanValue = bool.booleanValue();
                        String str3 = (String) this.F.get(i10);
                        bg.t tVar = h5Var.b;
                        TextView textView2 = h5Var.c;
                        z8 z8Var = h5Var.d;
                        o9 o9Var2 = h5Var.a;
                        h5Var.a();
                        if (user != null) {
                            o9Var2.setVisibility(0);
                            z8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                o9Var2.setImageDrawable(z8Var);
                            } else {
                                o9Var2.e(user, z8Var);
                            }
                        } else {
                            o9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            eq eqVar = new eq(R.drawable.mini_ephemeral_hidden_14, 0);
                            eqVar.setColorKey(f6.A6);
                            eqVar.setTopOffset(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            tVar.setText(spannableStringBuilder);
                        } else {
                            tVar.setText(str3);
                        }
                        textView2.setText(Emoji.replaceEmoji(str2, textView2.getPaint().getFontMetricsInt(), false));
                    }
                } else {
                    h5Var.setEmojiSuggestion((MediaDataController.KeywordResult) this.J.get(i10));
                }
            } else {
                h5Var.setText((String) this.E.get(i10));
            }
        }
        h5Var.setDivider(false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        b6 b6Var = this.D0;
        Context context = this.h;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    org.telegram.ui.Cells.i0 i0Var = new org.telegram.ui.Cells.i0(context);
                    TextView textView = new TextView(context);
                    i0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    textView.setTextColor(f6.w0(null, f6.Ce, false));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    i0Var.addView(textView, e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = i0Var;
                } else if (i9 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(f6.v0(f6.z6, b6Var));
                    view2 = textView2;
                } else if (i9 != 5) {
                    boolean z10 = this.s;
                    if (i9 == 6) {
                        view2 = new d1(context, b6Var, z10);
                    } else if (i9 != 7) {
                        b8 b8Var = new b8(context);
                        b8Var.v = b6Var;
                        o9 o9Var = new o9(context);
                        b8Var.a = o9Var;
                        o9Var.setAspectFit(true);
                        o9Var.setLayerNum(1);
                        b8Var.addView(o9Var, e6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        b8Var.setFocusable(true);
                        zf.b1 b1Var = new zf.b1(context, 1, null);
                        b8Var.n = b1Var;
                        b1Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        b1Var.setImageReceiver(o9Var.getImageReceiver());
                        b8Var.addView(b1Var, e6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = b8Var;
                    } else {
                        View anVar = new an(context, 7);
                        fq fqVar = new fq(new ColorDrawable(z10 ? f6.l1(0.15f, -1) : f6.v0(f6.a7, b6Var)), f6.U0(context, R.drawable.greydivider, f6.v0(f6.b7, b6Var)), 0, 0);
                        fqVar.w = true;
                        anVar.setBackground(fqVar);
                        view = anVar;
                    }
                } else {
                    view = new pf.m1(context, b6Var, false);
                }
            } else {
                e2 e2Var = new e2(context);
                e2Var.setDelegate(new s0(this));
                view2 = e2Var;
            }
            return new ik0(view2);
        }
        h5 h5Var = new h5(context, b6Var);
        h5Var.setIsDarkTheme(false);
        view = h5Var;
        view2 = view;
        return new ik0(view2);
    }
}
