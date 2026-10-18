package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class e9 extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public q2 I;
    public b9 J;
    public fd K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 R;
    public s8 S;
    public final c50 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final e50 X;
    public a9 Y;
    public boolean Z;
    public x8 a;
    public float a0;
    public y8 b;
    public ValueAnimator b0;
    public int c;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public sa1 r;
    public CharSequence s;
    public SpannableStringBuilder v;
    public boolean w;
    public ei.d x;
    public FrameLayout y;

    public e9(e50 e50Var, c50 c50Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.a0 = 0.0f;
        this.X = e50Var;
        this.T = c50Var;
    }

    public static void U(e9 e9Var) {
        if (e9Var.getParentActivity() == null) {
            return;
        }
        if (!e9Var.n) {
            e9Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e9Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new r8(e9Var, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        e9Var.showDialog(b2Var);
        b2Var.h();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), false);
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new v8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int o10 = i0.a.o(-1, 60);
        this.H.C(-1, false);
        i2.d.y(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.B(o10, false);
        org.telegram.ui.ActionBar.y n10 = this.H.n();
        n10.setClipChildren(false);
        c50 c50Var = this.T;
        org.telegram.ui.ActionBar.u0 e = n10.e(1, (c50Var == null || c50Var.c != 2) ? LocaleController.getString(R.string.SetPhoto) : LocaleController.getString(R.string.SuggestPhoto));
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.h6.g0(o10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new v8(this, 1));
        this.r = new sa1(this, getParentActivity(), 7);
        w8 w8Var = new w8(this, context);
        w8Var.setFitsSystemWindows(true);
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.r.setOrientation(1);
        sa1 sa1Var = this.r;
        x8 x8Var = new x8(this, getParentActivity(), w8Var);
        this.a = x8Var;
        sa1Var.addView(x8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.h6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, w7.z5.t(-1, -2, 0, 21, 10, 21, 10));
        ai.w1 w1Var = new ai.w1(this, getParentActivity());
        b9 b9Var = new b9(this, getParentActivity());
        this.J = b9Var;
        w1Var.addView(b9Var);
        this.r.addView(w1Var, w7.z5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.r.addView(this.V, w7.z5.t(-1, -2, 0, 21, 18, 21, 10));
        y8 y8Var = new y8(this, this, getParentActivity(), getThemedColor(i10));
        this.b = y8Var;
        y8Var.R = true;
        y8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, w7.z5.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        w8Var.addView(this.r, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 0));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.x = dVar;
        dVar.e();
        this.x.d.r(false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (c50Var == null || c50Var.c != 2) {
            this.s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        } else {
            this.s = LocaleController.getString(R.string.SuggestPhoto);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new yq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.w = false;
        this.x.g(this.s, false, true);
        this.x.setOnClickListener(new f0(this, 2));
        this.y = new FrameLayout(context);
        w8Var.addView(this.x, w7.z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80));
        w8Var.addView(this.y, w7.z5.a(80.0f, 8.0f, 16.0f, 8.0f, 64.0f, -1, 80));
        w8Var.addView(this.actionBar);
        w8Var.addView(this.H);
        w8Var.addView(this.e, w7.z5.d(-1.0f, -1));
        fd fdVar = new fd(w8Var);
        this.K = fdVar;
        fdVar.h = new q8(this, 0);
        this.fragmentView = w8Var;
        return w8Var;
    }

    public final void d0() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.G.cancel();
            this.G = null;
        }
    }

    public final boolean e0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        x8 x8Var = this.a;
        a9 a9Var = x8Var.h;
        return (a9Var != null && a9Var.b) || x8Var.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        boolean z10;
        int i10;
        byte b10;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        float f7;
        File file;
        MediaController.PhotoEntry photoEntry;
        TLRPC.Document f10;
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a.getImageReceiver() == null || !this.a.getImageReceiver().hasImageLoaded()) {
            return;
        }
        int i11 = 1;
        if (e0()) {
            new xc(this.y, this.resourceProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.PremiumAvatarToast), new q8(this, i11))).j();
            return;
        }
        q2 q2Var = this.I;
        if (q2Var != null) {
            x8 x8Var = this.a;
            a9 a9Var = x8Var.h;
            long j10 = x8Var.a;
            TLRPC.Document document2 = x8Var.b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) q2Var.b;
            e9 e9Var = (e9) q2Var.c;
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            ti tiVar = chatAttachAlertPhotoLayout.b;
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            hashMap.clear();
            Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            x20 x20Var = new x20();
            if (a9Var != null) {
                z10 = true;
                i10 = 0;
                x20Var.d(a9Var.c, a9Var.d, a9Var.e, a9Var.f);
            } else {
                z10 = true;
                i10 = 0;
                int[] iArr = c0[0];
                x20Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            x20Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, x20Var.c);
            File file2 = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file2.createNewFile();
                byteArrayOutputStream = new ByteArrayOutputStream();
                b10 = 4;
            } catch (IOException e) {
                e = e;
                b10 = 4;
            }
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, i10, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e7) {
                e = e7;
                e.printStackTrace();
                int i12 = (int) 120.00001f;
                int i13 = (int) 560.0f;
                imageReceiver = x8Var.getImageReceiver();
                if (imageReceiver.getAnimation() == null) {
                }
                file = new File(FileLoader.getDirectory(b10), SharedConfig.getLastLocalId() + "avatar_background.png");
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (x8Var.getImageReceiver().getAnimation() == null) {
                }
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file.getPath();
                if (x8Var.a == 0) {
                }
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                photoEntry.editedInfo = videoEditedInfo;
                videoEditedInfo.originalPath = file2.getPath();
                VideoEditedInfo videoEditedInfo2 = photoEntry.editedInfo;
                videoEditedInfo2.resultWidth = 800;
                videoEditedInfo2.resultHeight = 800;
                videoEditedInfo2.originalWidth = 800;
                videoEditedInfo2.originalHeight = 800;
                videoEditedInfo2.isPhoto = true;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = 0L;
                videoEditedInfo2.endTime = x8Var.getDuration();
                VideoEditedInfo videoEditedInfo3 = photoEntry.editedInfo;
                videoEditedInfo3.framerate = 30;
                videoEditedInfo3.avatarStartTime = 0L;
                long j11 = videoEditedInfo3.endTime;
                videoEditedInfo3.estimatedSize = (int) ((j11 / 1000.0f) * 115200.0f);
                videoEditedInfo3.estimatedDuration = j11;
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                if (document != null) {
                }
                if (f10 != null) {
                }
                if (this.Q) {
                }
            }
            int i122 = (int) 120.00001f;
            int i132 = (int) 560.0f;
            imageReceiver = x8Var.getImageReceiver();
            if (imageReceiver.getAnimation() == null) {
                Bitmap p5 = imageReceiver.getAnimation().p();
                f7 = 0.13f;
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setImageBitmap(p5);
                float f11 = i122;
                document = document2;
                float f12 = i132;
                imageReceiver2.setImageCoords(f11, f11, f12, f12);
                imageReceiver2.setRoundRadius((int) (f12 * 0.13f));
                imageReceiver2.draw(canvas);
                imageReceiver2.clearImage();
                p5.recycle();
            } else {
                document = document2;
                f7 = 0.13f;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, z10);
                }
                float f13 = i122;
                float f14 = i132;
                imageReceiver.setImageCoords(f13, f13, f14, f14);
                imageReceiver.setRoundRadius((int) (f14 * 0.13f));
                imageReceiver.draw(canvas);
            }
            file = new File(FileLoader.getDirectory(b10), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream22);
                byte[] byteArray22 = byteArrayOutputStream22.toByteArray();
                FileOutputStream fileOutputStream22 = new FileOutputStream(file);
                fileOutputStream22.write(byteArray22);
                fileOutputStream22.flush();
                fileOutputStream22.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (x8Var.getImageReceiver().getAnimation() == null || x8Var.getImageReceiver().getLottieAnimation() != null) {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file.getPath();
                if (x8Var.a == 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = x8Var.a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(x8Var.h.c));
                    int i14 = x8Var.h.d;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = x8Var.h.e;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    int i16 = x8Var.h.f;
                    if (i16 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeEmojiMarkup;
                } else if (x8Var.b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document3 = x8Var.b;
                    tL_videoSizeStickerMarkup.sticker_id = document3.id;
                    tL_videoSizeStickerMarkup.stickerset = MessageObject.getInputStickerSet(document3);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(x8Var.h.c));
                    int i17 = x8Var.h.d;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = x8Var.h.e;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    int i19 = x8Var.h.f;
                    if (i19 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i19));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeStickerMarkup;
                }
                VideoEditedInfo videoEditedInfo4 = new VideoEditedInfo();
                photoEntry.editedInfo = videoEditedInfo4;
                videoEditedInfo4.originalPath = file2.getPath();
                VideoEditedInfo videoEditedInfo22 = photoEntry.editedInfo;
                videoEditedInfo22.resultWidth = 800;
                videoEditedInfo22.resultHeight = 800;
                videoEditedInfo22.originalWidth = 800;
                videoEditedInfo22.originalHeight = 800;
                videoEditedInfo22.isPhoto = true;
                videoEditedInfo22.bitrate = -1;
                videoEditedInfo22.muted = true;
                videoEditedInfo22.startTime = 0L;
                videoEditedInfo22.start = 0L;
                videoEditedInfo22.endTime = x8Var.getDuration();
                VideoEditedInfo videoEditedInfo32 = photoEntry.editedInfo;
                videoEditedInfo32.framerate = 30;
                videoEditedInfo32.avatarStartTime = 0L;
                long j112 = videoEditedInfo32.endTime;
                videoEditedInfo32.estimatedSize = (int) ((j112 / 1000.0f) * 115200.0f);
                videoEditedInfo32.estimatedDuration = j112;
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                mediaEntity2.type = (byte) 0;
                f10 = document != null ? r5.f(UserConfig.selectedAccount, j10) : document;
                if (f10 != null) {
                    mediaEntity2.viewWidth = i132;
                    mediaEntity2.viewHeight = i132;
                    mediaEntity2.width = 0.7f;
                    mediaEntity2.height = 0.7f;
                    mediaEntity2.x = 0.15f;
                    mediaEntity2.y = 0.15f;
                    mediaEntity2.document = f10;
                    mediaEntity2.parentObject = null;
                    mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(f10, true).getAbsolutePath();
                    mediaEntity2.roundRadius = f7;
                    if (MessageObject.isAnimatedStickerDocument(f10, true) || MessageObject.isVideoStickerDocument(f10)) {
                        mediaEntity2.subType = (byte) ((MessageObject.isAnimatedStickerDocument(f10, true) ? (byte) 1 : b10) | mediaEntity2.subType);
                    }
                    if (MessageObject.isTextColorEmoji(f10)) {
                        mediaEntity2.color = -1;
                        mediaEntity2.subType = (byte) (mediaEntity2.subType | 8);
                    }
                    photoEntry.editedInfo.mediaEntities = new ArrayList<>();
                    photoEntry.editedInfo.mediaEntities.add(mediaEntity2);
                }
            } else {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, false, 0, 0, 0L);
            }
            hashMap.put(-1, photoEntry);
            ChatAttachAlertPhotoLayout.t1.add(-1);
            tiVar.c2.b0(7, true, false, 0, 0, 0L, tiVar.u1(), false, 0L);
            if (!e9Var.Q) {
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                if (n2Var != null) {
                    n2Var.removeSelfFromStack();
                }
                e9Var.finishFragment();
            }
        }
        if (this.Q) {
            return;
        }
        finishFragment();
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        if (this.U) {
            return;
        }
        d0();
        int i10 = 2;
        this.G = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        if (z11) {
            this.a.w = this.E;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        this.G.addUpdateListener(new ah.k0(6, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, i10));
        if (z12) {
            this.G.setInterpolator(bs.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(bs.f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j10, TLRPC.Document document) {
        x8 x8Var = this.a;
        x8Var.a = j10;
        ci.k4 k4Var = x8Var.c;
        x8Var.b = document;
        if (j10 == 0) {
            k4Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            k4Var.setAnimatedEmojiDrawable(new r5(14, this.currentAccount, j10));
            this.a.c.getImageReceiver().clearImage();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().getAnimation() != null) {
            this.a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().getLottieAnimation() != null) {
            this.a.getImageReceiver().getLottieAnimation().N(0, false, true);
        }
        this.n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        this.E = f7;
        float f10 = ((this.d - this.c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.r.setTranslationY(f10);
            this.x.setTranslationY(f10);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            this.a.setExpanded(f7 > 0.5f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (org.telegram.messenger.AndroidUtilities.computePerceivedBrightness(r5) > 0.721f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0040, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (org.telegram.messenger.AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false)) > 0.721f) goto L21;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isLightStatusBar() {
        boolean z10;
        x8 x8Var = this.a;
        if (x8Var != null && (x8Var.v || (x8Var.w >= 0.0f && x8Var.h != null))) {
            a9 a9Var = x8Var.h;
            int i10 = a9Var.c;
            int i11 = a9Var.d;
            if (i11 != 0) {
                i10 = i0.a.f(0.5f, i10, i11);
            }
            int i12 = a9Var.e;
            if (i12 != 0) {
                i10 = i0.a.f(0.5f, i10, i12);
            }
            int i13 = a9Var.f;
            if (i13 != 0) {
                i10 = i0.a.f(0.5f, i10, i13);
            }
        }
        if (this.Z != z10) {
            this.Z = z10;
            if (this.actionBar.getAlpha() == 0.0f) {
                j0(z10 ? 0.0f : 1.0f);
            } else {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.b0.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 0.0f : 1.0f);
                this.b0 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 3));
                this.b0.setDuration(150L).start();
            }
        }
        s8 s8Var = this.S;
        if (s8Var != null) {
            AndroidUtilities.setLightStatusBar(s8Var, z10);
        }
        return z10;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.a0 != f7) {
            this.a0 = f7;
            int f10 = i0.a.f(f7, -16777216, -1);
            int o10 = i0.a.o(f10, 60);
            this.H.C(f10, false);
            this.R.setBackground(org.telegram.ui.ActionBar.h6.g0(o10, 3, -1));
        }
    }

    public final void k0(long j10) {
        x8 x8Var = this.a;
        if (x8Var == null) {
            return;
        }
        a9 a9Var = new a9();
        int[] iArr = c0[0];
        a9Var.c = iArr[0];
        a9Var.d = iArr[1];
        a9Var.e = iArr[2];
        a9Var.f = iArr[3];
        x8Var.b(a9Var, false);
        n0();
        x8 x8Var2 = this.a;
        x8Var2.a = j10;
        x8Var2.c.setAnimatedEmojiDrawable(new r5(14, this.currentAccount, j10));
        this.J.x1(a9Var);
        this.b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        a9 a9Var = new a9();
        a9Var.c = i0.a.o(videoSize.background_colors.get(0).intValue(), 255);
        a9Var.d = videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), 255) : 0;
        a9Var.e = videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), 255) : 0;
        a9Var.f = videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), 255) : 0;
        this.a.b(a9Var, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i10 = 0; i10 < stickerSet.documents.size(); i10++) {
                    if (stickerSet.documents.get(i10).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i10);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.x1(a9Var);
        this.b.setForUser(true);
    }

    public final void m0(g9 g9Var) {
        a9 backgroundGradient = g9Var.getBackgroundGradient();
        x8 x8Var = this.a;
        if (x8Var == null) {
            return;
        }
        x8Var.b(backgroundGradient, false);
        n0();
        if (g9Var.getAnimatedEmoji() != null) {
            long i10 = g9Var.getAnimatedEmoji().i();
            x8 x8Var2 = this.a;
            x8Var2.a = i10;
            x8Var2.c.setAnimatedEmojiDrawable(new r5(14, this.currentAccount, i10));
        }
        this.J.x1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void n0() {
        boolean e02 = e0();
        if (this.w != e02) {
            ei.d dVar = this.x;
            this.w = e02;
            dVar.g(e02 ? this.v : this.s, true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!this.n) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new r8(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        showDialog(b2Var);
        b2Var.h();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }
}
