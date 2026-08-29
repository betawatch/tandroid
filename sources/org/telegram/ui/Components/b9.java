package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
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
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b9 extends org.telegram.ui.ActionBar.o2 {
    public static final int[][] Y = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] Z = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float A;
    public boolean B;
    public ValueAnimator C;
    public org.telegram.ui.ActionBar.l D;
    public j1 E;
    public y8 F;
    public ad G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public final Paint K;
    public int L;
    public boolean M;
    public org.telegram.ui.ActionBar.w0 N;
    public p8 O;
    public final q40 P;
    public boolean Q;
    public TextView R;
    public TextView S;
    public final s40 T;
    public x8 U;
    public boolean V;
    public float W;
    public ValueAnimator X;
    public u8 a;
    public v8 b;
    public int c;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public ua1 r;
    public CharSequence s;
    public SpannableStringBuilder v;
    public boolean w;
    public nh.d x;
    public FrameLayout y;

    public b9(s40 s40Var, q40 q40Var) {
        super(null);
        this.K = new Paint();
        this.M = true;
        this.V = false;
        this.W = 0.0f;
        this.T = s40Var;
        this.P = q40Var;
    }

    public static void U(b9 b9Var) {
        if (b9Var.getParentActivity() == null) {
            return;
        }
        if (!b9Var.n) {
            b9Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b9Var.getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new o8(b9Var, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        b9Var.showDialog(c2Var);
        c2Var.h();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        lVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), false);
        org.telegram.ui.th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.D = lVar2;
        lVar2.setCastShadows(false);
        this.D.setAddToContainer(false);
        this.D.setOccupyStatusBar(true);
        this.D.setClipChildren(false);
        int k9 = i0.a.k(-1, 60);
        this.D.C(-1, false);
        org.telegram.ui.th.y(false, this.D);
        this.D.setAllowOverlayTitle(false);
        this.D.B(k9, false);
        org.telegram.ui.ActionBar.a0 n10 = this.D.n();
        n10.setClipChildren(false);
        q40 q40Var = this.P;
        org.telegram.ui.ActionBar.w0 e10 = n10.e(1, (q40Var == null || q40Var.c != 2) ? LocaleController.getString(R.string.SetPhoto) : LocaleController.getString(R.string.SuggestPhoto));
        this.N = e10;
        e10.setBackground(org.telegram.ui.ActionBar.g6.f0(k9, 3, -1));
        this.D.setActionBarMenuOnItemClick(new s8(this, 1));
        this.r = new ua1(this, getParentActivity(), 7);
        t8 t8Var = new t8(this, context);
        t8Var.setFitsSystemWindows(true);
        t8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.r.setOrientation(1);
        ua1 ua1Var = this.r;
        u8 u8Var = new u8(this, getParentActivity(), t8Var);
        this.a = u8Var;
        ua1Var.addView(u8Var);
        TextView textView = new TextView(getParentActivity());
        this.S = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.S;
        int i11 = org.telegram.ui.ActionBar.g6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.r.addView(this.S, i7.f6.t(-1, -2, 0, 21, 10, 21, 10));
        bg.z3 z3Var = new bg.z3(this, getParentActivity());
        y8 y8Var = new y8(this, getParentActivity());
        this.F = y8Var;
        z3Var.addView(y8Var);
        this.r.addView(z3Var, i7.f6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.R = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.R.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.r.addView(this.R, i7.f6.t(-1, -2, 0, 21, 18, 21, 10));
        v8 v8Var = new v8(this, this, getParentActivity(), getThemedColor(i10));
        this.b = v8Var;
        v8Var.N = true;
        v8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, i7.f6.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        t8Var.addView(this.r, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        nh.d dVar = new nh.d(context, this.resourceProvider, true);
        this.x = dVar;
        dVar.e();
        this.x.d.o(false, false, false);
        int i12 = this.T.R;
        if (i12 == 1) {
            this.s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (q40Var == null || q40Var.c != 2) {
            this.s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        } else {
            this.s = LocaleController.getString(R.string.SuggestPhoto);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.w = false;
        this.x.g(this.s, false, true);
        this.x.setOnClickListener(new h0(this, 3));
        this.y = new FrameLayout(context);
        t8Var.addView(this.x, i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        t8Var.addView(this.y, i7.f6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        t8Var.addView(this.actionBar);
        t8Var.addView(this.D);
        t8Var.addView(this.e, i7.f6.c(-1.0f, -1));
        ad adVar = new ad(t8Var);
        this.G = adVar;
        adVar.h = new n8(this, 0);
        this.fragmentView = t8Var;
        return t8Var;
    }

    public final void d0() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.C.cancel();
            this.C = null;
        }
    }

    public final boolean e0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        u8 u8Var = this.a;
        x8 x8Var = u8Var.h;
        return (x8Var != null && x8Var.b) || u8Var.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        int i10;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        File file;
        MediaController.PhotoEntry photoEntry;
        TLRPC.Document f9;
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a.getImageReceiver() == null || !this.a.getImageReceiver().hasImageLoaded()) {
            return;
        }
        int i11 = 1;
        if (e0()) {
            new tc(this.y, this.resourceProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.PremiumAvatarToast), new n8(this, i11))).j();
            return;
        }
        j1 j1Var = this.E;
        if (j1Var != null) {
            u8 u8Var = this.a;
            x8 x8Var = u8Var.h;
            long j10 = u8Var.a;
            TLRPC.Document document2 = u8Var.b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) j1Var.b;
            b9 b9Var = (b9) j1Var.c;
            boolean z10 = ChatAttachAlertPhotoLayout.m1;
            ni niVar = chatAttachAlertPhotoLayout.b;
            HashMap hashMap = ChatAttachAlertPhotoLayout.o1;
            hashMap.clear();
            Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            k20 k20Var = new k20();
            if (x8Var != null) {
                k20Var.d(x8Var.c, x8Var.d, x8Var.e, x8Var.f);
            } else {
                int[] iArr = Y[0];
                k20Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            k20Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, k20Var.c);
            File file2 = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file2.createNewFile();
                byteArrayOutputStream = new ByteArrayOutputStream();
                i10 = 4;
            } catch (IOException e10) {
                e = e10;
                i10 = 4;
            }
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e11) {
                e = e11;
                e.printStackTrace();
                int i12 = (int) 120.00001f;
                int i13 = (int) 560.0f;
                imageReceiver = u8Var.getImageReceiver();
                if (imageReceiver.getAnimation() == null) {
                }
                file = new File(FileLoader.getDirectory(i10), SharedConfig.getLastLocalId() + "avatar_background.png");
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (u8Var.getImageReceiver().getAnimation() == null) {
                }
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file.getPath();
                if (u8Var.a == 0) {
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
                videoEditedInfo2.endTime = u8Var.getDuration();
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
                if (f9 != null) {
                }
                if (this.M) {
                }
            }
            int i122 = (int) 120.00001f;
            int i132 = (int) 560.0f;
            imageReceiver = u8Var.getImageReceiver();
            if (imageReceiver.getAnimation() == null) {
                Bitmap p10 = imageReceiver.getAnimation().p();
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setImageBitmap(p10);
                float f10 = i122;
                document = document2;
                float f11 = i132;
                imageReceiver2.setImageCoords(f10, f10, f11, f11);
                imageReceiver2.setRoundRadius((int) (f11 * 0.13f));
                imageReceiver2.draw(canvas);
                imageReceiver2.clearImage();
                p10.recycle();
            } else {
                document = document2;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                float f12 = i122;
                float f13 = i132;
                imageReceiver.setImageCoords(f12, f12, f13, f13);
                imageReceiver.setRoundRadius((int) (f13 * 0.13f));
                imageReceiver.draw(canvas);
            }
            file = new File(FileLoader.getDirectory(i10), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream22);
                byte[] byteArray22 = byteArrayOutputStream22.toByteArray();
                FileOutputStream fileOutputStream22 = new FileOutputStream(file);
                fileOutputStream22.write(byteArray22);
                fileOutputStream22.flush();
                fileOutputStream22.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            if (u8Var.getImageReceiver().getAnimation() == null || u8Var.getImageReceiver().getLottieAnimation() != null) {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file.getPath();
                if (u8Var.a == 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = u8Var.a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(u8Var.h.c));
                    int i14 = u8Var.h.d;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = u8Var.h.e;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    int i16 = u8Var.h.f;
                    if (i16 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeEmojiMarkup;
                } else if (u8Var.b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document3 = u8Var.b;
                    tL_videoSizeStickerMarkup.sticker_id = document3.id;
                    tL_videoSizeStickerMarkup.stickerset = MessageObject.getInputStickerSet(document3);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(u8Var.h.c));
                    int i17 = u8Var.h.d;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = u8Var.h.e;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    int i19 = u8Var.h.f;
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
                videoEditedInfo22.endTime = u8Var.getDuration();
                VideoEditedInfo videoEditedInfo32 = photoEntry.editedInfo;
                videoEditedInfo32.framerate = 30;
                videoEditedInfo32.avatarStartTime = 0L;
                long j112 = videoEditedInfo32.endTime;
                videoEditedInfo32.estimatedSize = (int) ((j112 / 1000.0f) * 115200.0f);
                videoEditedInfo32.estimatedDuration = j112;
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                mediaEntity2.type = (byte) 0;
                f9 = document != null ? p5.f(UserConfig.selectedAccount, j10) : document;
                if (f9 != null) {
                    mediaEntity2.viewWidth = i132;
                    mediaEntity2.viewHeight = i132;
                    mediaEntity2.width = 0.7f;
                    mediaEntity2.height = 0.7f;
                    mediaEntity2.x = 0.15f;
                    mediaEntity2.y = 0.15f;
                    mediaEntity2.document = f9;
                    mediaEntity2.parentObject = null;
                    mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(f9, true).getAbsolutePath();
                    mediaEntity2.roundRadius = 0.13f;
                    if (MessageObject.isAnimatedStickerDocument(f9, true) || MessageObject.isVideoStickerDocument(f9)) {
                        mediaEntity2.subType = (byte) ((MessageObject.isAnimatedStickerDocument(f9, true) ? (byte) 1 : (byte) 4) | mediaEntity2.subType);
                    }
                    if (MessageObject.isTextColorEmoji(f9)) {
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
            ChatAttachAlertPhotoLayout.p1.add(-1);
            niVar.V1.B1(7, true, false, 0, 0, 0L, niVar.s1(), false, 0L);
            if (!b9Var.M) {
                org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
                if (o2Var != null) {
                    o2Var.removeSelfFromStack();
                }
                b9Var.finishFragment();
            }
        }
        if (this.M) {
            return;
        }
        finishFragment();
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        if (this.Q) {
            return;
        }
        d0();
        int i10 = 2;
        this.C = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        if (z11) {
            this.a.w = this.A;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.C.addUpdateListener(new bg.c1(7, this, z11));
        this.C.addListener(new org.telegram.ui.ActionBar.h(this, z10, z11, i10));
        if (z12) {
            this.C.setInterpolator(jr.h);
            this.C.setDuration(350L);
            this.C.setStartDelay(150L);
        } else {
            this.C.setInterpolator(jr.f);
            this.C.setDuration(250L);
        }
        this.C.start();
    }

    public final void h0(boolean z10, long j10, TLRPC.Document document) {
        u8 u8Var = this.a;
        u8Var.a = j10;
        lh.y3 y3Var = u8Var.c;
        u8Var.b = document;
        if (j10 == 0) {
            y3Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            y3Var.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j10));
            this.a.c.getImageReceiver().clearImage();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().getAnimation() != null) {
            this.a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().getLottieAnimation() != null) {
            this.a.getImageReceiver().getLottieAnimation().L(0, false, true);
        }
        this.n = true;
        n0();
    }

    public final void i0(float f9, boolean z10) {
        this.A = f9;
        float f10 = ((this.d - this.c) - AndroidUtilities.statusBarHeight) * f9;
        if (this.J == 0.0f) {
            this.r.setTranslationY(f10);
            this.x.setTranslationY(f10);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f9);
        this.fragmentView.invalidate();
        if (z10) {
            this.a.setExpanded(f9 > 0.5f);
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
    
        if (org.telegram.messenger.AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)) > 0.721f) goto L21;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isLightStatusBar() {
        boolean z10;
        u8 u8Var = this.a;
        if (u8Var != null && (u8Var.v || (u8Var.w >= 0.0f && u8Var.h != null))) {
            x8 x8Var = u8Var.h;
            int i10 = x8Var.c;
            int i11 = x8Var.d;
            if (i11 != 0) {
                i10 = i0.a.d(0.5f, i10, i11);
            }
            int i12 = x8Var.e;
            if (i12 != 0) {
                i10 = i0.a.d(0.5f, i10, i12);
            }
            int i13 = x8Var.f;
            if (i13 != 0) {
                i10 = i0.a.d(0.5f, i10, i13);
            }
        }
        if (this.V != z10) {
            this.V = z10;
            if (this.actionBar.getAlpha() == 0.0f) {
                j0(z10 ? 0.0f : 1.0f);
            } else {
                ValueAnimator valueAnimator = this.X;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.X.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z10 ? 0.0f : 1.0f);
                this.X = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 3));
                this.X.setDuration(150L).start();
            }
        }
        p8 p8Var = this.O;
        if (p8Var != null) {
            AndroidUtilities.setLightStatusBar(p8Var, z10);
        }
        return z10;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f9) {
        if (this.W != f9) {
            this.W = f9;
            int d = i0.a.d(f9, -16777216, -1);
            int k9 = i0.a.k(d, 60);
            this.D.C(d, false);
            this.N.setBackground(org.telegram.ui.ActionBar.g6.f0(k9, 3, -1));
        }
    }

    public final void k0(long j10) {
        u8 u8Var = this.a;
        if (u8Var == null) {
            return;
        }
        x8 x8Var = new x8();
        int[] iArr = Y[0];
        x8Var.c = iArr[0];
        x8Var.d = iArr[1];
        x8Var.e = iArr[2];
        x8Var.f = iArr[3];
        u8Var.b(x8Var, false);
        n0();
        u8 u8Var2 = this.a;
        u8Var2.a = j10;
        u8Var2.c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j10));
        this.F.w1(x8Var);
        this.b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        x8 x8Var = new x8();
        x8Var.c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        x8Var.d = videoSize.background_colors.size() > 1 ? i0.a.k(videoSize.background_colors.get(1).intValue(), 255) : 0;
        x8Var.e = videoSize.background_colors.size() > 2 ? i0.a.k(videoSize.background_colors.get(2).intValue(), 255) : 0;
        x8Var.f = videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0;
        this.a.b(x8Var, false);
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
        this.F.w1(x8Var);
        this.b.setForUser(true);
    }

    public final void m0(d9 d9Var) {
        x8 backgroundGradient = d9Var.getBackgroundGradient();
        u8 u8Var = this.a;
        if (u8Var == null) {
            return;
        }
        u8Var.b(backgroundGradient, false);
        n0();
        if (d9Var.getAnimatedEmoji() != null) {
            long i10 = d9Var.getAnimatedEmoji().i();
            u8 u8Var2 = this.a;
            u8Var2.a = i10;
            u8Var2.c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, i10));
        }
        this.F.w1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void n0() {
        boolean e02 = e0();
        if (this.w != e02) {
            nh.d dVar = this.x;
            this.w = e02;
            dVar.g(e02 ? this.v : this.s, true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!this.n) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new o8(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        showDialog(c2Var);
        c2Var.h();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }
}
