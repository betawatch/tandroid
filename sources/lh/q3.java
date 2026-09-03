package lh;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class q3 extends View {
    public final TextPaint a;
    public final y80 b;
    public final Paint c;
    public final Paint d;
    public StaticLayout e;
    public boolean f;
    public int h;
    public int n;
    public BitmapShader r;
    public Matrix s;
    public Matrix v;
    public CharSequence w;

    public q3(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(6.0f);
        this.n = AndroidUtilities.dp(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        this.b = new y80(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.w = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.a, i10 - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        y80 y80Var = this.b;
        y80Var.rewind();
        int i11 = this.h;
        int i12 = this.n;
        y80Var.e = i11;
        y80Var.f = i12;
        if (this.f) {
            y80Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i13 = 0; i13 < this.e.getLineCount(); i13++) {
                width = Math.min(width, this.e.getLineLeft(i13));
                f11 = Math.min(f11, this.e.getLineTop(i13));
                f12 = Math.max(f12, this.e.getLineRight(i13));
                f10 = Math.max(f10, this.e.getLineBottom(i13));
            }
            this.b.addRect(width, f11, f12, this.e.getHeight(), Path.Direction.CW);
        } else {
            y80Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), y80Var);
            y80Var.a();
        }
        invalidate();
    }

    public final void b(int i10, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(savedStarGift.gift.owner_id);
        if (clientUserId == peerDialogId) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(savedStarGift.gift.crafted ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(savedStarGift.date))));
        } else if (clientUserId == peerDialogId2) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
        } else {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(savedStarGift.date))));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
            Matrix matrix = this.s;
            if (matrix != null) {
                matrix.reset();
                this.v.reset();
                View view = this;
                while (view != null) {
                    this.v.postConcat(view.getMatrix());
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                this.v.invert(this.s);
                this.s.preTranslate((-this.h) / 2, -AndroidUtilities.dp(16.0f));
                this.s.preScale(12.0f, 12.0f);
                this.r.setLocalMatrix(this.s);
            }
            Paint paint = this.c;
            y80 y80Var = this.b;
            canvas.drawPath(y80Var, paint);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(l1);
            canvas.drawPath(y80Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.w;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        StaticLayout staticLayout = this.e;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null || message.action == null) {
            setVisibility(8);
            return;
        }
        int i10 = messageObject.currentAccount;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            setVisibility(8);
            return;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            setVisibility(8);
            return;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer == null) {
            setVisibility(8);
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.peer);
        if (clientUserId == peerDialogId) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString((tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(messageObject.messageOwner.date))));
        } else if (clientUserId == peerDialogId2) {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
        } else {
            set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(messageObject.messageOwner.date))));
        }
        setVisibility(0);
    }

    public void setFullRect(boolean z4) {
        this.f = z4;
    }

    public void setRoundRadius(float f10) {
        this.c.setPathEffect(new CornerPathEffect(f10));
        this.d.setPathEffect(new CornerPathEffect(f10));
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
