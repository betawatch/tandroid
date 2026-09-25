package ci;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class l8 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public da E0;
    public long H;
    public boolean H0;
    public long I;
    public long J;
    public long J0;
    public boolean K;
    public File L;
    public TLRPC.InputMedia L0;
    public boolean M;
    public Bitmap M0;
    public String N;
    public File N0;
    public Bitmap O;
    public File O0;
    public File P0;
    public int Q;
    public File Q0;
    public int R;
    public File R0;
    public t S;
    public ArrayList T;
    public ArrayList T0;
    public List U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public MediaController.SavedFilterState a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public ai.c5 d0;
    public k8 d1;
    public long e;
    public int f;
    public boolean f0;
    public boolean g;
    public Bitmap g0;
    public boolean h;
    public long h0;
    public boolean j;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public ArrayList m;
    public MediaController.CropState m0;
    public boolean n;
    public boolean o;
    public File o0;
    public SpannableStringBuilder p;
    public String p0;
    public TLRPC.Peer q;
    public long q0;
    public int r;
    public long r0;
    public String s;
    public float s0;
    public TLRPC.MessageMedia t;
    public boolean u;
    public ArrayList v;
    public TLRPC.InputPeer v0;
    public boolean w;
    public HashSet w0;
    public TLRPC.TL_error x;
    public Drawable x0;
    public String y;
    public TLRPC.InputDocument z;
    public final int a = UserConfig.selectedAccount;
    public double i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float a0 = 1.0f;
    public long e0 = -1;
    public int i0 = 720;
    public int j0 = 1280;
    public final Matrix n0 = new Matrix();
    public float t0 = 1.0f;
    public float u0 = 1.0f;
    public boolean y0 = org.telegram.ui.ActionBar.h6.I.q();
    public long z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int e1 = 0;

    public static void C(BitmapFactory.Options options, int i10) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        if (i11 * i12 * 8 > maxMemory || Math.max(i11, i12) > 4200 || SharedConfig.getDevicePerformanceClass() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i10;
        }
    }

    public static Boolean D(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.Peer peer;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(message.peer_id)));
        if ((chat == null || !chat.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat)) {
            return Boolean.FALSE;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
            if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2))) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public static l8 a(t tVar, ArrayList arrayList) {
        l8 l8Var = new l8();
        l8Var.S = tVar;
        l8Var.T = arrayList;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l8 l8Var2 = (l8) obj;
            if (l8Var2.K) {
                l8Var.K = true;
                l8Var2.V = 0.0f;
                l8Var2.W = Math.min(1.0f, 59000.0f / l8Var2.h0);
            }
        }
        if (l8Var.K) {
            l8Var.k0 = 720;
            l8Var.l0 = 1280;
            l8Var.i0 = 720;
            l8Var.j0 = 1280;
        } else {
            l8Var.k0 = 1080;
            l8Var.l0 = 1920;
            l8Var.i0 = 1080;
            l8Var.j0 = 1920;
        }
        l8Var.A();
        return l8Var;
    }

    public static int d(BitmapFactory.Options options, int i10, int i11) {
        double min = (options.outHeight > i11 || options.outWidth > i10) ? Math.min((int) Math.ceil(r0 / i11), (int) Math.ceil(r6 / i10)) : 1;
        return Math.max(1, (int) Math.pow(min, Math.floor(Math.log(min) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i10, int i11) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float max = Math.max(i10 / width, i11 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static l8 l(MediaController.PhotoEntry photoEntry) {
        int i10;
        l8 l8Var = new l8();
        l8Var.L = new File(photoEntry.path);
        l8Var.Q = photoEntry.orientation;
        l8Var.R = photoEntry.invert;
        l8Var.K = !photoEntry.isLivePhoto() && photoEntry.isVideo;
        l8Var.N = photoEntry.thumbPath;
        long j3 = photoEntry.duration * 1000;
        l8Var.h0 = j3;
        l8Var.Z = 0.0f;
        l8Var.a0 = Math.min(1.0f, 59000.0f / j3);
        if (l8Var.K && l8Var.N == null) {
            l8Var.N = "vthumb://" + photoEntry.imageId;
        }
        l8Var.A0 = photoEntry.gradientTopColor;
        l8Var.B0 = photoEntry.gradientBottomColor;
        l8Var.h(l8Var.L.getAbsolutePath());
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            l8Var.k0 = i11;
            l8Var.l0 = i10;
        }
        l8Var.A();
        return l8Var;
    }

    public static l8 m(int i10, File file) {
        l8 l8Var = new l8();
        l8Var.L = file;
        l8Var.M = true;
        l8Var.Q = i10;
        l8Var.R = 0;
        l8Var.K = false;
        if (file != null) {
            l8Var.h(file.getAbsolutePath());
        }
        l8Var.A();
        return l8Var;
    }

    public static l8 n(File file, TL_stories.StoryItem storyItem) {
        l8 l8Var = new l8();
        l8Var.g = true;
        l8Var.f = storyItem.id;
        l8Var.L = file;
        l8Var.M = false;
        l8Var.k0 = 720;
        l8Var.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i10 = l8Var.a;
        if (z10) {
            l8Var.K = false;
            if (file != null) {
                l8Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            l8Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        l8Var.k0 = documentAttribute.w;
                        l8Var.l0 = documentAttribute.h;
                        l8Var.i = documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    l8Var.N = str;
                } else if (document2.thumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i12);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            l8Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            l8Var.N = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        ArrayList arrayList = l8Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i13);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueDisallowUsers.users.size(); i14++) {
                        TLRPC.InputUser inputUser = messagesController.getInputUser(tL_privacyValueDisallowUsers.users.get(i14).longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i15 = 0; i15 < tL_privacyValueAllowUsers.users.size(); i15++) {
                        TLRPC.InputUser inputUser2 = messagesController.getInputUser(tL_privacyValueAllowUsers.users.get(i15).longValue());
                        if (!(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        l8Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.h6.o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, storyItem.entities, true, false, true, false);
            l8Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, storyItem.entities, org.telegram.ui.ActionBar.h6.o2.getFontMetricsInt());
        } catch (Exception unused) {
        }
        l8Var.A();
        l8Var.e(storyItem);
        l8Var.m = storyItem.media_areas;
        l8Var.v0 = MessagesController.getInstance(i10).getInputPeer(storyItem.dialogId);
        return l8Var;
    }

    public static l8 o(File file, String str, long j3) {
        l8 l8Var = new l8();
        l8Var.c1 = true;
        l8Var.L = file;
        l8Var.M = true;
        l8Var.Q = 0;
        l8Var.R = 0;
        l8Var.K = true;
        l8Var.h0 = j3;
        l8Var.N = str;
        l8Var.Z = 0.0f;
        l8Var.a0 = Math.min(1.0f, 59500.0f / j3);
        return l8Var;
    }

    public static long p(MessageObject messageObject) {
        Boolean D = D(messageObject);
        if (D == null) {
            return 0L;
        }
        return D.booleanValue() ? DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id) : messageObject.getDialogId();
    }

    public static Bitmap q(j8 j8Var, int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (i12 == 90 || i12 == 270) {
            i13 = i10;
            i14 = i11;
        } else {
            i14 = i10;
            i13 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        j8Var.g(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i15 = options.outWidth;
        int i16 = options.outHeight;
        boolean z11 = ((double) ((((long) (i14 * i13)) * 4) + (((long) (i15 * i16)) * 4))) * 1.1d <= ((double) maxMemory);
        if (i15 <= i14 && i16 <= i13) {
            return j8Var.g(options);
        }
        if (z10 && z11 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap g10 = j8Var.g(options);
            float max = Math.max(i14 / g10.getWidth(), i13 / g10.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (g10.getWidth() * max), (int) (g10.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(g10, createBitmap, Utilities.libyuv_ScaleFilter.Box);
            Utilities.clamp(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i17 = options.outWidth;
        float f7 = i14 / i17;
        int i18 = options.outHeight;
        if (f7 > i13 / i18) {
            options.inDensity = i17;
            options.inTargetDensity = i14;
        } else {
            options.inDensity = i18;
            options.inTargetDensity = i13;
        }
        return j8Var.g(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j3;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    RLottieNative a2 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a2 != null) {
                        int i10 = a2.a[0];
                        a2.d();
                        j3 = i10;
                    } else {
                        j3 = 0;
                    }
                    if (j3 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.tgnet.TLRPC$PhotoSize, org.telegram.tgnet.TLRPC$TL_photoSize_layer127] */
    public static File w(int i10, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str) || "webm".equals(str)) {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer1272 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer1272.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_videoSize_layer1272;
        } else {
            ?? tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_photoSize_layer127;
        }
        return FileLoader.getInstance(i10).getPathToAttach(tL_videoSize_layer127, str, true);
    }

    public static File x(int i10, boolean z10) {
        return w(i10, z10 ? "mp4" : "jpg");
    }

    public static l8 y(ArrayList arrayList) {
        MessageObject messageObject;
        int i10;
        l8 l8Var = new l8();
        l8Var.u = true;
        l8Var.v = arrayList;
        l8Var.i0 = 1080;
        l8Var.j0 = 1920;
        l8Var.z0 = p((MessageObject) arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.x = 0.5f;
        mediaEntity.y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        l8Var.T0 = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i10 = messageObject.type) == 8 || i10 == 3 || i10 == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
                l8Var.L = new File(messageObject.messageOwner.attachPath);
            }
            File file = l8Var.L;
            if (file == null || !file.exists()) {
                l8Var.L = FileLoader.getInstance(l8Var.a).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = l8Var.L;
            if (file2 != null && file2.exists()) {
                l8Var.K = true;
                l8Var.M = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                l8Var.h0 = duration;
                l8Var.Z = 0.0f;
                l8Var.a0 = Math.min(1.0f, 59500.0f / duration);
                return l8Var;
            }
            l8Var.L = null;
        }
        return l8Var;
    }

    public final void A() {
        Matrix matrix = this.n0;
        matrix.reset();
        int i10 = this.k0;
        int i11 = this.l0;
        int i12 = this.Q;
        int i13 = this.R;
        matrix.postScale(i13 == 1 ? -1.0f : 1.0f, i13 == 2 ? -1.0f : 1.0f, i10 / 2.0f, i11 / 2.0f);
        if (i12 != 0) {
            matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
            matrix.postRotate(i12);
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            matrix.postTranslate(i10 / 2.0f, i11 / 2.0f);
        }
        float f7 = i10;
        float f10 = this.i0 / f7;
        if (this.J0 != 0) {
            f10 = Math.min(f10, this.j0 / i11);
        } else {
            float f11 = i11;
            if (f11 / f7 > 1.29f) {
                f10 = Math.max(f10, this.j0 / f11);
            }
        }
        matrix.postScale(f10, f10);
        matrix.postTranslate(com.google.android.gms.internal.vision.e2.v(f7, f10, this.i0, 2.0f), com.google.android.gms.internal.vision.e2.v(i11, f10, this.j0, 2.0f));
    }

    public final void B() {
        if (!this.K || v() || this.g || this.n || this.h0 <= 69000 || !UserConfig.getInstance(this.a).isPremium()) {
            return;
        }
        long j3 = this.h0 - 59000;
        long min = j3 > 10000 ? Math.min(59000L, j3) + 59000 : 59000L;
        long j10 = this.h0 - min;
        if (j10 > 10000) {
            min += Math.min(59000L, j10);
        }
        this.a0 = Math.min(1.0f, min / this.h0);
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (messageObject = (MessageObject) this.v.get(0)) == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList3.get(i10);
                    byte b10 = mediaEntity.type;
                    if (b10 != 0) {
                        if (b10 == 1 && (arrayList2 = mediaEntity.entities) != null && !arrayList2.isEmpty()) {
                            for (int i11 = 0; i11 < mediaEntity.entities.size(); i11++) {
                                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                                if (!u(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                                }
                            }
                        }
                    } else if (!u(mediaEntity.document, mediaEntity.text)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(Bitmap bitmap, float f7) {
        final int i10;
        Bitmap bitmap2;
        float f10;
        Paint paint;
        Bitmap q6;
        Paint paint2;
        Bitmap bitmap3;
        int i11;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i12 = (int) (this.i0 * f7);
        int i13 = (int) (this.j0 * f7);
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        final int i14 = 0;
        if (this.Y0 != null) {
            try {
                Bitmap q10 = q(new j8() { // from class: ci.h8
                    @Override // ci.j8
                    public final Bitmap g(BitmapFactory.Options options) {
                        switch (i14) {
                            case 0:
                                return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                            case 1:
                                return BitmapFactory.decodeFile(this.P0.getPath(), options);
                            case 2:
                                return BitmapFactory.decodeFile(this.W0.getPath(), options);
                            default:
                                return BitmapFactory.decodeFile(this.R0.getPath(), options);
                        }
                    }
                }, i12, i13, 0, true);
                canvas.save();
                float width = this.i0 / q10.getWidth();
                canvas.scale(width, width);
                matrix.postScale(f7, f7);
                canvas.drawBitmap(q10, 0.0f, 0.0f, paint3);
                canvas.restore();
                q10.recycle();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            long j3 = this.z0;
            if (j3 == Long.MIN_VALUE) {
                Paint paint4 = new Paint(1);
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.A0, this.B0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i10 = 0;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint4);
                matrix.set(this.n0);
                if (bitmap == null) {
                    float width2 = this.k0 / bitmap.getWidth();
                    matrix.preScale(width2, width2);
                    matrix.postScale(f7, f7);
                    canvas.drawBitmap(bitmap, matrix, paint3);
                    return createBitmap;
                }
                if (v()) {
                    int i15 = 0;
                    while (i15 < this.T.size()) {
                        l8 l8Var = (l8) this.T.get(i15);
                        final File file = l8Var.Z0;
                        if (file == null) {
                            file = l8Var.L;
                        }
                        if (file != null) {
                            try {
                                Bitmap q11 = q(new j8() { // from class: ci.i8
                                    @Override // ci.j8
                                    public final Bitmap g(BitmapFactory.Options options) {
                                        switch (i10) {
                                        }
                                        return BitmapFactory.decodeFile(file.getPath(), options);
                                    }
                                }, i12, i13, i10, true);
                                canvas.save();
                                RectF rectF = new RectF();
                                int width3 = q11.getWidth();
                                int height = q11.getHeight();
                                if ((((Integer) AndroidUtilities.getImageOrientation(file).first).intValue() / 90) % 2 == 1) {
                                    width3 = q11.getHeight();
                                    height = q11.getWidth();
                                }
                                s sVar = (s) this.S.e.get(i15);
                                float f11 = i12;
                                bitmap3 = createBitmap;
                                float f12 = i13;
                                try {
                                    i11 = i15;
                                    try {
                                        paint2 = paint3;
                                        try {
                                            rectF.set(sVar.a(f11), sVar.c * (f12 / sVar.a.c), sVar.b(f11), (f12 / sVar.a.c) * (sVar.c + 1));
                                            canvas.translate(rectF.centerX(), rectF.centerY());
                                            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                            float max = Math.max(rectF.width() / width3, rectF.height() / height);
                                            canvas.scale(max, max);
                                            canvas.rotate(((Integer) r2.first).intValue());
                                            canvas.translate((-q11.getWidth()) / 2.0f, (-q11.getHeight()) / 2.0f);
                                        } catch (Exception e7) {
                                            e = e7;
                                            FileLog.e(e);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                        try {
                                            canvas.drawBitmap(q11, 0.0f, 0.0f, (Paint) null);
                                            canvas.restore();
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        paint2 = paint3;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    paint2 = paint3;
                                    i11 = i15;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                paint2 = paint3;
                                bitmap3 = createBitmap;
                                i11 = i15;
                            }
                        } else {
                            paint2 = paint3;
                            bitmap3 = createBitmap;
                            i11 = i15;
                        }
                        i15 = i11 + 1;
                        createBitmap = bitmap3;
                        paint3 = paint2;
                        i10 = 0;
                    }
                    bitmap2 = createBitmap;
                    f10 = 0.0f;
                    paint = paint3;
                } else {
                    bitmap2 = createBitmap;
                    f10 = 0.0f;
                    final File file2 = this.Z0;
                    if (file2 == null) {
                        file2 = this.L;
                    }
                    if (file2 != null) {
                        try {
                            final int i16 = 1;
                            q6 = q(new j8() { // from class: ci.i8
                                @Override // ci.j8
                                public final Bitmap g(BitmapFactory.Options options) {
                                    switch (i16) {
                                    }
                                    return BitmapFactory.decodeFile(file2.getPath(), options);
                                }
                            }, i12, i13, this.Q, true);
                            float width4 = this.k0 / q6.getWidth();
                            matrix.preScale(width4, width4);
                            matrix.postScale(f7, f7);
                            paint = paint3;
                        } catch (Exception e14) {
                            e = e14;
                            paint = paint3;
                        }
                        try {
                            canvas.drawBitmap(q6, matrix, paint);
                            q6.recycle();
                        } catch (Exception e15) {
                            e = e15;
                            FileLog.e(e);
                            if (this.P0 != null) {
                            }
                            if (this.W0 != null) {
                            }
                            if (this.R0 != null) {
                            }
                        }
                    } else {
                        paint = paint3;
                    }
                }
                if (this.P0 != null) {
                    try {
                        final int i17 = 1;
                        Bitmap q12 = q(new j8() { // from class: ci.h8
                            @Override // ci.j8
                            public final Bitmap g(BitmapFactory.Options options) {
                                switch (i17) {
                                    case 0:
                                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                                }
                            }
                        }, i12, i13, 0, true);
                        canvas.save();
                        float width5 = this.i0 / q12.getWidth();
                        canvas.scale(width5, width5);
                        matrix.postScale(f7, f7);
                        canvas.drawBitmap(q12, f10, f10, paint);
                        canvas.restore();
                        q12.recycle();
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                }
                if (this.W0 != null) {
                    try {
                        final int i18 = 2;
                        Bitmap q13 = q(new j8() { // from class: ci.h8
                            @Override // ci.j8
                            public final Bitmap g(BitmapFactory.Options options) {
                                switch (i18) {
                                    case 0:
                                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                                }
                            }
                        }, i12, i13, 0, true);
                        canvas.save();
                        float width6 = this.i0 / q13.getWidth();
                        canvas.scale(width6, width6);
                        matrix.postScale(f7, f7);
                        canvas.drawBitmap(q13, f10, f10, paint);
                        canvas.restore();
                        q13.recycle();
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                }
                if (this.R0 != null) {
                    return bitmap2;
                }
                try {
                    final int i19 = 3;
                    Bitmap q14 = q(new j8() { // from class: ci.h8
                        @Override // ci.j8
                        public final Bitmap g(BitmapFactory.Options options) {
                            switch (i19) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.R0.getPath(), options);
                            }
                        }
                    }, i12, i13, 0, true);
                    canvas.save();
                    float width7 = this.i0 / q14.getWidth();
                    canvas.scale(width7, width7);
                    matrix.postScale(f7, f7);
                    canvas.drawBitmap(q14, f10, f10, paint);
                    canvas.restore();
                    q14.recycle();
                    return bitmap2;
                } catch (Exception e18) {
                    FileLog.e(e18);
                    return bitmap2;
                }
            }
            Drawable drawable = this.x0;
            if (drawable == null) {
                drawable = b7.e(null, this.a, j3, this.y0);
            }
            j(canvas, drawable, canvas.getWidth(), canvas.getHeight());
        }
        i10 = 0;
        matrix.set(this.n0);
        if (bitmap == null) {
        }
    }

    public final void c(File file) {
        Bitmap b10 = b(null, 1.0f);
        Bitmap bitmap = this.b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.b1 = null;
        }
        this.b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        b10.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem == null || storyItem.media == null) {
            return;
        }
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null) {
            TLRPC.Document document = messageMedia.document;
            if (document == null || !MessageObject.isDocumentHasAttachedStickers(document)) {
                return;
            }
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        } else {
            if (!photo.has_stickers) {
                return;
            }
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr2 = photo.file_reference;
            tL_inputPhoto.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        }
        this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new ai.p3(this, storyItem, tL_messages_getAttachedStickers, new ai.n8(this, 5)));
    }

    public final void f() {
        File file = this.P0;
        if (file != null) {
            file.delete();
            this.P0 = null;
        }
        File file2 = this.Y0;
        if (file2 != null) {
            file2.delete();
            this.Y0 = null;
        }
        File file3 = this.W0;
        if (file3 != null) {
            file3.delete();
            this.W0 = null;
        }
        File file4 = this.X0;
        if (file4 != null) {
            file4.delete();
            this.X0 = null;
        }
        File file5 = this.R0;
        if (file5 != null) {
            file5.delete();
            this.R0 = null;
        }
    }

    public final l8 g() {
        l8 l8Var = new l8();
        l8Var.b = this.b;
        l8Var.c = this.c;
        l8Var.d = this.d;
        l8Var.e = this.e;
        l8Var.f = this.f;
        l8Var.g = this.g;
        l8Var.h = this.h;
        l8Var.i = this.i;
        l8Var.j = this.j;
        l8Var.k = this.k;
        l8Var.l = this.l;
        l8Var.m = this.m;
        l8Var.w = this.w;
        l8Var.x = this.x;
        l8Var.y = this.y;
        l8Var.z = this.z;
        l8Var.A = this.A;
        l8Var.B = this.B;
        l8Var.C = this.C;
        l8Var.D = this.D;
        l8Var.E = this.E;
        l8Var.F = this.F;
        l8Var.G = this.G;
        l8Var.H = this.H;
        l8Var.I = this.I;
        l8Var.J = this.J;
        l8Var.K = this.K;
        l8Var.L = this.L;
        l8Var.M = this.M;
        boolean z10 = this.M;
        int i10 = this.a;
        if (z10) {
            File w10 = w(i10, k(this.L));
            l8Var.L = w10;
            AndroidUtilities.copyFileSafe(this.L, w10);
        }
        l8Var.N = this.N;
        l8Var.Y = this.Y;
        l8Var.Z = this.Z;
        l8Var.a0 = this.a0;
        l8Var.h0 = this.h0;
        l8Var.k0 = this.k0;
        l8Var.l0 = this.l0;
        l8Var.i0 = this.i0;
        l8Var.j0 = this.j0;
        l8Var.v0 = this.v0;
        l8Var.R = this.R;
        l8Var.n0.set(this.n0);
        l8Var.A0 = this.A0;
        l8Var.B0 = this.B0;
        l8Var.C0 = this.C0;
        l8Var.D0 = this.D0;
        l8Var.E0 = this.E0;
        ArrayList arrayList = l8Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        l8Var.G0 = this.G0;
        l8Var.H0 = this.H0;
        l8Var.I0 = this.I0;
        l8Var.M0 = this.M0;
        l8Var.N0 = this.N0;
        l8Var.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i10, k(this.N0));
            l8Var.N0 = w11;
            AndroidUtilities.copyFileSafe(this.N0, w11);
        }
        l8Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i10, k(this.O0));
            l8Var.O0 = w12;
            AndroidUtilities.copyFileSafe(this.O0, w12);
        }
        l8Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i10, k(this.P0));
            l8Var.P0 = w13;
            AndroidUtilities.copyFileSafe(this.P0, w13);
        }
        l8Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i10, k(this.W0));
            l8Var.W0 = w14;
            AndroidUtilities.copyFileSafe(this.W0, w14);
        }
        l8Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i10, k(this.Y0));
            l8Var.Y0 = w15;
            AndroidUtilities.copyFileSafe(this.Y0, w15);
        }
        l8Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i10, k(this.Q0));
            l8Var.Q0 = w16;
            AndroidUtilities.copyFileSafe(this.Q0, w16);
        }
        l8Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i10, k(this.R0));
            l8Var.R0 = w17;
            AndroidUtilities.copyFileSafe(this.R0, w17);
        }
        l8Var.S0 = this.S0;
        l8Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i11 = 0; i11 < this.T0.size(); i11++) {
                l8Var.T0.add(((VideoEditedInfo.MediaEntity) this.T0.get(i11)).copy());
            }
        }
        l8Var.U0 = this.U0;
        l8Var.V0 = this.V0;
        l8Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i10, k(this.Z0));
            l8Var.Z0 = w18;
            AndroidUtilities.copyFileSafe(this.Z0, w18);
        }
        l8Var.a1 = this.a1;
        l8Var.b1 = this.b1;
        l8Var.c1 = this.c1;
        l8Var.O = this.O;
        l8Var.n = this.n;
        l8Var.o = this.o;
        l8Var.o0 = this.o0;
        l8Var.s0 = this.s0;
        l8Var.t0 = this.t0;
        l8Var.q0 = this.q0;
        l8Var.p0 = this.p0;
        l8Var.r0 = this.r0;
        l8Var.u0 = this.u0;
        l8Var.b0 = this.b0;
        l8Var.J0 = this.J0;
        l8Var.K0 = this.K0;
        l8Var.L0 = this.L0;
        l8Var.e0 = this.e0;
        l8Var.T = this.T;
        l8Var.S = this.S;
        l8Var.U = this.U;
        l8Var.X = this.X;
        l8Var.P = this.P;
        return l8Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.k0 = options.outWidth;
                this.l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (this.K) {
            return;
        }
        if (((int) Math.max(this.k0, (this.l0 / 16.0f) * 9.0f)) <= 900) {
            this.i0 = 720;
            this.j0 = 1280;
        } else {
            this.i0 = 1080;
            this.j0 = 1920;
        }
    }

    public final void i(boolean z10) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z10) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.g || this.j)) {
                    file3.delete();
                }
                this.L = null;
            }
            if (this.N != null) {
                if (this.M) {
                    new File(this.N).delete();
                }
                this.N = null;
            }
            ArrayList arrayList = this.T0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) obj;
                    if (mediaEntity.type == 2 && !TextUtils.isEmpty(mediaEntity.segmentedPath)) {
                        try {
                            new File(mediaEntity.segmentedPath).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.o0;
            if (file4 != null && (!this.g || this.j)) {
                file4.delete();
                this.o0 = null;
            }
            if (this.p0 != null && (!this.g || this.j)) {
                try {
                    new File(this.p0).delete();
                } catch (Exception unused) {
                }
                this.p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                ((l8) this.T.get(i11)).i(z10);
            }
        }
        if (this.e1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.e1, true);
        }
    }

    public final int r() {
        if (!this.K || v() || this.g) {
            return 1;
        }
        long j3 = this.h0;
        if (j3 <= 0 || this.n) {
            return 1;
        }
        if (((long) ((this.a0 - this.Z) * j3)) < 68999) {
            return 1;
        }
        return (int) Math.ceil(r0 / 59000.0f);
    }

    public final void s(Utilities.Callback callback) {
        int i10;
        if (!E()) {
            callback.run(null);
            return;
        }
        if (!this.K && ((i10 = this.i0) > 720 || this.j0 > 1280)) {
            float f7 = 720.0f / i10;
            this.n0.postScale(f7, f7, 0.0f, 0.0f);
            this.i0 = 720;
            this.j0 = 1280;
        }
        File file = this.L;
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, v() ? this.T.size() : 0), 11);
        iArr[0] = new int[11];
        ai.h5 h5Var = new ai.h5(this, absolutePath, iArr, callback, 6);
        if (!v()) {
            if (this.L == null) {
                h5Var.run();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new a3.k0(absolutePath, iArr, h5Var, 17));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            strArr[i11] = ((l8) this.T.get(i11)).L == null ? null : ((l8) this.T.get(i11)).L.getAbsolutePath();
            iArr[i11] = new int[11];
        }
        Utilities.globalQueue.postRunnable(new a3.k0(strArr, iArr, h5Var, 16));
    }

    public final boolean t() {
        if (v()) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                if (((l8) this.T.get(i10)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.S == null || this.T == null) ? false : true;
    }

    public final void z(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N == null) {
                Bitmap bitmap2 = this.O;
                if (bitmap2 != null) {
                    int[] b10 = n0.b(bitmap2, true);
                    this.A0 = b10[0];
                    this.B0 = b10[1];
                    runnable.run();
                    return;
                }
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.N.startsWith("vthumb://")) {
                    long parseInt = Integer.parseInt(this.N.substring(9));
                    options.inJustDecodeBounds = true;
                    MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                    options.inSampleSize = d(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                int[] b11 = n0.b(bitmap, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                bitmap.recycle();
                runnable.run();
            }
        }
    }
}
