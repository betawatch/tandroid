package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o extends View {
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public final ArrayList e;
    public float f;
    public float h;
    public Integer n;

    public o(Context context) {
        super(context);
        this.e = new ArrayList();
        this.a = 20;
        this.b = 60;
        this.c = 60;
    }

    public final void a(ig.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        String findAnimatedEmojiEmoticon;
        TLRPC.TL_availableReaction tL_availableReaction2 = q0Var.f != null ? MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f) : null;
        if (tL_availableReaction2 == null) {
            document = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, q0Var.g);
            if (document != null && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) != null) {
                tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(findAnimatedEmojiEmoticon);
            }
            tL_availableReaction = tL_availableReaction2;
        } else {
            tL_availableReaction = tL_availableReaction2;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document != null || tL_availableReaction == null) {
            org.telegram.ui.Components.k5 n10 = document == null ? org.telegram.ui.Components.k5.n(2, q0Var.g, null, UserConfig.selectedAccount) : org.telegram.ui.Components.k5.m(2, UserConfig.selectedAccount, document);
            if (this.n != null) {
                n10.setColorFilter(new PorterDuffColorFilter(this.n.intValue(), PorterDuff.Mode.MULTIPLY));
            }
            ig.d a2 = ig.d.a(n10, false, !n10.c());
            a2.f(this);
            arrayList.add(a2);
            invalidate();
            return;
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setParentView(this);
        int i10 = this.d;
        this.d = i10 + 1;
        imageReceiver.setUniqKeyPrefix(Integer.toString(i10));
        ImageLocation forDocument = ImageLocation.getForDocument(tL_availableReaction.around_animation);
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.b;
        sb2.append(i11);
        sb2.append("_");
        sb2.append(i11);
        sb2.append("_nolimit");
        imageReceiver.setImage(forDocument, sb2.toString(), null, "tgs", tL_availableReaction, 1);
        imageReceiver.setAutoRepeat(0);
        imageReceiver.onAttachedToWindow();
        arrayList.add(imageReceiver);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(this.c);
        int dp2 = AndroidUtilities.dp(this.b);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f10 = dp2;
                imageReceiver.setImageCoords((getMeasuredWidth() - dp2) / 2.0f, (getMeasuredHeight() - dp2) / 2.0f, f10, f10);
                imageReceiver.draw(canvas);
            } else if (obj instanceof ig.d) {
                ig.d dVar = (ig.d) obj;
                dVar.e((int) ((getMeasuredWidth() - dp) / 2.0f), (int) ((getMeasuredHeight() - dp) / 2.0f), (int) ((getMeasuredWidth() + dp) / 2.0f), (int) ((getMeasuredHeight() + dp) / 2.0f));
                dVar.b(canvas);
                if (dVar.c()) {
                    dVar.d(this);
                    arrayList.remove(dVar);
                }
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).onDetachedFromWindow();
                } else if (obj instanceof ig.d) {
                    ((ig.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int max = Math.max(this.a, this.b);
        int i12 = this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i12, max)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i12, Math.max(r4, r5))), TLObject.FLAG_30));
    }

    public void setColor(int i10) {
        this.n = Integer.valueOf(i10);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i11);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).setColorFilter(porterDuffColorFilter);
            } else if (obj instanceof ig.d) {
                ((ig.d) obj).a.setColorFilter(porterDuffColorFilter2);
            }
            i11++;
        }
    }
}
