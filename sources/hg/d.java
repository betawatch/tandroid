package hg;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.py;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d {
    public static int m;
    public k5 a;
    public Rect b;
    public ArrayList c;
    public View d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public ImageReceiver j;
    public int k;
    public long l;

    public static d a(k5 k5Var, boolean z10, boolean z11) {
        int i9 = UserConfig.selectedAccount;
        d dVar = new d();
        dVar.b = new Rect();
        dVar.c = new ArrayList();
        dVar.g = true;
        dVar.k = -1;
        dVar.a = k5Var;
        dVar.f = z10;
        dVar.h = i9;
        dVar.i = z11;
        dVar.e = System.currentTimeMillis();
        if (z11 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            dVar.j = imageReceiver;
            if (z10) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas) {
        float f10;
        Rect rect = this.b;
        ImageReceiver imageReceiver = this.j;
        ArrayList arrayList = this.c;
        boolean z10 = this.f;
        if (z10) {
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j10 = currentTimeMillis - this.e;
                if (j10 < 1500 && j10 > 200 && currentTimeMillis - this.l > 50 && Utilities.fastRandom.nextInt() % 6 == 0) {
                    c cVar = new c(this);
                    cVar.a();
                    arrayList.add(cVar);
                    this.l = currentTimeMillis;
                }
            }
        } else if (this.g) {
            for (int i9 = 0; i9 < 7; i9++) {
                c cVar2 = new c(this);
                cVar2.a();
                arrayList.add(cVar2);
            }
        }
        if (imageReceiver != null && this.i && (imageReceiver.getLottieAnimation() == null || !imageReceiver.getLottieAnimation().y())) {
            if (z10) {
                canvas.save();
                canvas.translate(rect.width() / 3.0f, 0.0f);
                imageReceiver.draw(canvas);
                canvas.restore();
            } else {
                imageReceiver.draw(canvas);
            }
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar3 = (c) arrayList.get(i10);
            float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / cVar3.i) + cVar3.h;
            cVar3.h = min;
            float clamp = Utilities.clamp(min, 1.0f, 0.0f);
            cVar3.h = clamp;
            gr grVar = gr.g;
            float interpolation = grVar.getInterpolation(clamp);
            float lerp = AndroidUtilities.lerp(cVar3.a, cVar3.c, interpolation);
            d dVar = cVar3.l;
            k5 k5Var = dVar.a;
            float f11 = cVar3.h;
            float lerp2 = f11 < 0.3f ? AndroidUtilities.lerp(cVar3.b, cVar3.d, grVar.getInterpolation(f11 / 0.3f)) : AndroidUtilities.lerp(cVar3.d, cVar3.e, gr.i.getInterpolation((f11 - 0.3f) / 0.7f));
            float lerp3 = AndroidUtilities.lerp(cVar3.f, cVar3.g, interpolation);
            if (!dVar.f) {
                float height = dVar.b.height() * 0.8f;
                if (lerp2 > height) {
                    f10 = 1.0f - Utilities.clamp((lerp2 - height) / AndroidUtilities.dp(16.0f), 1.0f, 0.0f);
                    float f12 = (lerp3 / 2.0f) * f10;
                    canvas.save();
                    if (cVar3.j) {
                        canvas.scale(-1.0f, 1.0f, lerp, lerp2);
                    }
                    canvas.rotate(cVar3.k, lerp, lerp2);
                    k5Var.setAlpha((int) (Utilities.clamp(cVar3.h / 0.2f, 1.0f, 0.0f) * f10 * 255.0f));
                    k5Var.setBounds((int) (lerp - f12), (int) (lerp2 - f12), (int) (lerp + f12), (int) (lerp2 + f12));
                    k5Var.draw(canvas);
                    k5Var.setAlpha(255);
                    canvas.restore();
                    if (((c) arrayList.get(i10)).h < 1.0f) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            f10 = 1.0f;
            float f122 = (lerp3 / 2.0f) * f10;
            canvas.save();
            if (cVar3.j) {
            }
            canvas.rotate(cVar3.k, lerp, lerp2);
            k5Var.setAlpha((int) (Utilities.clamp(cVar3.h / 0.2f, 1.0f, 0.0f) * f10 * 255.0f));
            k5Var.setBounds((int) (lerp - f122), (int) (lerp2 - f122), (int) (lerp + f122), (int) (lerp2 + f122));
            k5Var.draw(canvas);
            k5Var.setAlpha(255);
            canvas.restore();
            if (((c) arrayList.get(i10)).h < 1.0f) {
            }
            i10++;
        }
        canvas.restore();
        View view = this.d;
        if (view != null) {
            view.invalidate();
        }
        this.g = false;
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.e > 2500;
    }

    public final void d(View view) {
        this.a.o(view);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i9, int i10, int i11, int i12) {
        Rect rect = this.b;
        rect.set(i9, i10, i11, i12);
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f;
        int i9 = this.h;
        k5 k5Var = this.a;
        k5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.j;
        if (imageReceiver == null || !this.i) {
            return;
        }
        imageReceiver.onAttachedToWindow();
        TLRPC.Document document2 = k5Var.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
        if (findAnimatedEmojiEmoticon == null || (tL_availableReaction = MediaDataController.getInstance(i9).getReactionsMap().get(findAnimatedEmojiEmoticon)) == null || (document = tL_availableReaction.around_animation) == null) {
            z10 = true;
            z11 = false;
        } else {
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                int i10 = m;
                m = i10 + 1;
                sb2.append(i10);
                sb2.append(" ");
                imageReceiver.setUniqKeyPrefix(sb2.toString());
                int f10 = py.f();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), f10 + "_" + f10 + "_pcache_compress", null, null, document3, 0);
            } else {
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String a2 = n0.a();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z10 = true;
                imageReceiver.setImage(forDocument, a2, null, null, document4, 0);
            }
            z11 = true;
        }
        if (!z11) {
            String str = UserConfig.getInstance(i9).genericAnimationsStickerPack;
            if (str != null && (tL_messages_stickerSet = MediaDataController.getInstance(i9).getStickerSetByName(str)) == null) {
                tL_messages_stickerSet = MediaDataController.getInstance(i9).getStickerSetByEmojiOrName(str);
            }
            if (tL_messages_stickerSet != null) {
                if (this.k < 0) {
                    this.k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                }
                if (z12) {
                    StringBuilder sb3 = new StringBuilder();
                    int i11 = m;
                    m = i11 + 1;
                    sb3.append(i11);
                    sb3.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb3.toString());
                    int f11 = py.f();
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.k)), f11 + "_" + f11 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.k), 0);
                }
                z11 = true;
            }
        }
        if (z11) {
            if (imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().L(0, false, z10);
            }
            imageReceiver.setAutoRepeat(0);
        } else {
            imageReceiver.setImageBitmap(new mi0(R.raw.custom_emoji_reaction, "" + R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
