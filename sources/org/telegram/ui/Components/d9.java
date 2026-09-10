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
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d9 extends org.telegram.ui.ActionBar.p2 {
    public static final int[][] c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.l H;
    public org.telegram.ui.oe I;
    public a9 J;
    public ed K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.w0 R;
    public r8 S;
    public final c50 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final e50 X;
    public z8 Y;
    public boolean Z;
    public w8 a;
    public float a0;
    public x8 b;
    public ValueAnimator b0;
    public int c;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public gc1 r;
    public CharSequence s;
    public SpannableStringBuilder v;
    public boolean w;
    public bi.d x;
    public FrameLayout y;

    public d9(e50 e50Var, c50 c50Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.a0 = 0.0f;
        this.X = e50Var;
        this.T = c50Var;
    }

    public static void U(d9 d9Var) {
        if (d9Var.getParentActivity() == null) {
            return;
        }
        if (!d9Var.n) {
            d9Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d9Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new q8(d9Var, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d9Var.showDialog(d2Var);
        d2Var.h();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), false);
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new u8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.H = lVar2;
        lVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.C(-1, false);
        com.google.android.gms.internal.vision.e2.t(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.A(k10, false);
        org.telegram.ui.ActionBar.z n10 = this.H.n();
        n10.setClipChildren(false);
        c50 c50Var = this.T;
        org.telegram.ui.ActionBar.w0 e = n10.e(1, (c50Var == null || c50Var.c != 2) ? LocaleController.getString(R.string.SetPhoto) : LocaleController.getString(R.string.SuggestPhoto));
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new u8(this, 1));
        this.r = new gc1(this, getParentActivity(), 5);
        v8 v8Var = new v8(this, context);
        v8Var.setFitsSystemWindows(true);
        v8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.r.setOrientation(1);
        gc1 gc1Var = this.r;
        w8 w8Var = new w8(this, getParentActivity(), v8Var);
        this.a = w8Var;
        gc1Var.addView(w8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, w7.a6.t(-1, -2, 0, 21, 10, 21, 10));
        bi.w7 w7Var = new bi.w7(this, getParentActivity());
        a9 a9Var = new a9(this, getParentActivity());
        this.J = a9Var;
        w7Var.addView(a9Var);
        this.r.addView(w7Var, w7.a6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.r.addView(this.V, w7.a6.t(-1, -2, 0, 21, 18, 21, 10));
        x8 x8Var = new x8(this, this, getParentActivity(), getThemedColor(i10));
        this.b = x8Var;
        x8Var.R = true;
        x8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, w7.a6.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        v8Var.addView(this.r, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        bi.d dVar = new bi.d(context, this.resourceProvider, true);
        this.x = dVar;
        dVar.e();
        this.x.d.o(false, false, false);
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
        spannableStringBuilder.setSpan(new uq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.w = false;
        this.x.g(this.s, false, true);
        this.x.setOnClickListener(new h0(this, 3));
        this.y = new FrameLayout(context);
        v8Var.addView(this.x, w7.a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        v8Var.addView(this.y, w7.a6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        v8Var.addView(this.actionBar);
        v8Var.addView(this.H);
        v8Var.addView(this.e, w7.a6.c(-1.0f, -1));
        ed edVar = new ed(v8Var);
        this.K = edVar;
        edVar.h = new p8(this, 0);
        this.fragmentView = v8Var;
        return v8Var;
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
        w8 w8Var = this.a;
        z8 z8Var = w8Var.h;
        return (z8Var != null && z8Var.b) || w8Var.n;
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
        TLRPC.Document f7;
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a.getImageReceiver() == null || !this.a.getImageReceiver().hasImageLoaded()) {
            return;
        }
        int i11 = 1;
        if (e0()) {
            new wc(this.y, this.resourceProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.PremiumAvatarToast), new p8(this, i11))).j();
            return;
        }
        org.telegram.ui.oe oeVar = this.I;
        if (oeVar != null) {
            w8 w8Var = this.a;
            z8 z8Var = w8Var.h;
            long j3 = w8Var.a;
            TLRPC.Document document2 = w8Var.b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) oeVar.b;
            d9 d9Var = (d9) oeVar.c;
            boolean z10 = ChatAttachAlertPhotoLayout.q1;
            yi yiVar = chatAttachAlertPhotoLayout.b;
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            hashMap.clear();
            Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            x20 x20Var = new x20();
            if (z8Var != null) {
                x20Var.d(z8Var.c, z8Var.d, z8Var.e, z8Var.f);
            } else {
                int[] iArr = c0[0];
                x20Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            x20Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, x20Var.c);
            File file2 = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "avatar_background.png");
            try {
                file2.createNewFile();
                byteArrayOutputStream = new ByteArrayOutputStream();
                i10 = 4;
            } catch (IOException e) {
                e = e;
                i10 = 4;
            }
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
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
                imageReceiver = w8Var.getImageReceiver();
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
                if (w8Var.getImageReceiver().getAnimation() == null) {
                }
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file.getPath();
                if (w8Var.a == 0) {
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
                videoEditedInfo2.endTime = w8Var.getDuration();
                VideoEditedInfo videoEditedInfo3 = photoEntry.editedInfo;
                videoEditedInfo3.framerate = 30;
                videoEditedInfo3.avatarStartTime = 0L;
                long j10 = videoEditedInfo3.endTime;
                videoEditedInfo3.estimatedSize = (int) ((j10 / 1000.0f) * 115200.0f);
                videoEditedInfo3.estimatedDuration = j10;
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                if (document != null) {
                }
                if (f7 != null) {
                }
                if (this.Q) {
                }
            }
            int i122 = (int) 120.00001f;
            int i132 = (int) 560.0f;
            imageReceiver = w8Var.getImageReceiver();
            if (imageReceiver.getAnimation() == null) {
                Bitmap p5 = imageReceiver.getAnimation().p();
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setImageBitmap(p5);
                float f10 = i122;
                document = document2;
                float f11 = i132;
                imageReceiver2.setImageCoords(f10, f10, f11, f11);
                imageReceiver2.setRoundRadius((int) (f11 * 0.13f));
                imageReceiver2.draw(canvas);
                imageReceiver2.clearImage();
                p5.recycle();
            } else {
                document = document2;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
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
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (w8Var.getImageReceiver().getAnimation() == null || w8Var.getImageReceiver().getLottieAnimation() != null) {
                photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file2.getPath(), 0, false, 0, 0, 0L);
                photoEntry.thumbPath = file.getPath();
                if (w8Var.a == 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = w8Var.a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(w8Var.h.c));
                    int i14 = w8Var.h.d;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = w8Var.h.e;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    int i16 = w8Var.h.f;
                    if (i16 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    photoEntry.emojiMarkup = tL_videoSizeEmojiMarkup;
                } else if (w8Var.b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document3 = w8Var.b;
                    tL_videoSizeStickerMarkup.sticker_id = document3.id;
                    tL_videoSizeStickerMarkup.stickerset = MessageObject.getInputStickerSet(document3);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(w8Var.h.c));
                    int i17 = w8Var.h.d;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = w8Var.h.e;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    int i19 = w8Var.h.f;
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
                videoEditedInfo22.endTime = w8Var.getDuration();
                VideoEditedInfo videoEditedInfo32 = photoEntry.editedInfo;
                videoEditedInfo32.framerate = 30;
                videoEditedInfo32.avatarStartTime = 0L;
                long j102 = videoEditedInfo32.endTime;
                videoEditedInfo32.estimatedSize = (int) ((j102 / 1000.0f) * 115200.0f);
                videoEditedInfo32.estimatedDuration = j102;
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                mediaEntity2.type = (byte) 0;
                f7 = document != null ? p5.f(UserConfig.selectedAccount, j3) : document;
                if (f7 != null) {
                    mediaEntity2.viewWidth = i132;
                    mediaEntity2.viewHeight = i132;
                    mediaEntity2.width = 0.7f;
                    mediaEntity2.height = 0.7f;
                    mediaEntity2.x = 0.15f;
                    mediaEntity2.y = 0.15f;
                    mediaEntity2.document = f7;
                    mediaEntity2.parentObject = null;
                    mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(f7, true).getAbsolutePath();
                    mediaEntity2.roundRadius = 0.13f;
                    if (MessageObject.isAnimatedStickerDocument(f7, true) || MessageObject.isVideoStickerDocument(f7)) {
                        mediaEntity2.subType = (byte) ((MessageObject.isAnimatedStickerDocument(f7, true) ? (byte) 1 : (byte) 4) | mediaEntity2.subType);
                    }
                    if (MessageObject.isTextColorEmoji(f7)) {
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
            yiVar.Z1.A1(7, true, false, 0, 0, 0L, yiVar.s1(), false, 0L);
            if (!d9Var.Q) {
                org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
                if (p2Var != null) {
                    p2Var.removeSelfFromStack();
                }
                d9Var.finishFragment();
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
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.G.addUpdateListener(new bi.m7(4, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, i10));
        if (z12) {
            this.G.setInterpolator(wr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(wr.f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j3, TLRPC.Document document) {
        w8 w8Var = this.a;
        w8Var.a = j3;
        gg.i1 i1Var = w8Var.c;
        w8Var.b = document;
        if (j3 == 0) {
            i1Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            i1Var.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j3));
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
    
        if (org.telegram.messenger.AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)) > 0.721f) goto L21;
     */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isLightStatusBar() {
        boolean z10;
        w8 w8Var = this.a;
        if (w8Var != null && (w8Var.v || (w8Var.w >= 0.0f && w8Var.h != null))) {
            z8 z8Var = w8Var.h;
            int i10 = z8Var.c;
            int i11 = z8Var.d;
            if (i11 != 0) {
                i10 = i0.a.d(0.5f, i10, i11);
            }
            int i12 = z8Var.e;
            if (i12 != 0) {
                i10 = i0.a.d(0.5f, i10, i12);
            }
            int i13 = z8Var.f;
            if (i13 != 0) {
                i10 = i0.a.d(0.5f, i10, i13);
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
                ofFloat.addUpdateListener(new j6(this, 3));
                this.b0.setDuration(150L).start();
            }
        }
        r8 r8Var = this.S;
        if (r8Var != null) {
            AndroidUtilities.setLightStatusBar(r8Var, z10);
        }
        return z10;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.a0 != f7) {
            this.a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.C(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        }
    }

    public final void k0(long j3) {
        w8 w8Var = this.a;
        if (w8Var == null) {
            return;
        }
        z8 z8Var = new z8();
        int[] iArr = c0[0];
        z8Var.c = iArr[0];
        z8Var.d = iArr[1];
        z8Var.e = iArr[2];
        z8Var.f = iArr[3];
        w8Var.b(z8Var, false);
        n0();
        w8 w8Var2 = this.a;
        w8Var2.a = j3;
        w8Var2.c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j3));
        this.J.v1(z8Var);
        this.b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        z8 z8Var = new z8();
        z8Var.c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        z8Var.d = videoSize.background_colors.size() > 1 ? i0.a.k(videoSize.background_colors.get(1).intValue(), 255) : 0;
        z8Var.e = videoSize.background_colors.size() > 2 ? i0.a.k(videoSize.background_colors.get(2).intValue(), 255) : 0;
        z8Var.f = videoSize.background_colors.size() > 3 ? i0.a.k(videoSize.background_colors.get(3).intValue(), 255) : 0;
        this.a.b(z8Var, false);
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
        this.J.v1(z8Var);
        this.b.setForUser(true);
    }

    public final void m0(f9 f9Var) {
        z8 backgroundGradient = f9Var.getBackgroundGradient();
        w8 w8Var = this.a;
        if (w8Var == null) {
            return;
        }
        w8Var.b(backgroundGradient, false);
        n0();
        if (f9Var.getAnimatedEmoji() != null) {
            long i10 = f9Var.getAnimatedEmoji().i();
            w8 w8Var2 = this.a;
            w8Var2.a = i10;
            w8Var2.c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, i10));
        }
        this.J.v1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void n0() {
        boolean e02 = e0();
        if (this.w != e02) {
            bi.d dVar = this.x;
            this.w = e02;
            dVar.g(e02 ? this.v : this.s, true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new q8(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        showDialog(d2Var);
        d2Var.h();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }
}
