package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l8 extends View implements org.telegram.ui.ActionBar.b6 {
    public static Object I;
    public static Vector J;
    public float D;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.g6 a;
    public final TextPaint b;
    public final PorterDuffColorFilter c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.n5 f;
    public final b80 h;
    public final Path n;
    public final ArrayList r;
    public final ArrayList s;
    public boolean w;
    public boolean x;
    public final Object y;

    public l8(Context context, int i7, TLObject tLObject, Object obj, boolean z9, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.a = g6Var;
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 0, 8);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.s6.j(this, a02, null, M, g6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i11 = org.telegram.ui.ActionBar.l6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        this.c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), PorterDuff.Mode.SRC_IN);
        b80 b80Var = new b80(g6Var);
        this.h = b80Var;
        b80Var.setCallback(this);
        b80Var.f(org.telegram.ui.ActionBar.l6.r1(0.2f, -1), org.telegram.ui.ActionBar.l6.r1(0.05f, -1));
        Path path = new Path();
        this.n = path;
        b80Var.y = path;
        b80Var.k(4.0f);
        boolean[] zArr = {true};
        this.y = obj;
        if (!z9) {
            this.w = true;
            this.x = false;
            ArrayList arrayList2 = new ArrayList();
            this.s = arrayList2;
            arrayList2.addAll(arrayList);
            if (this.s.size() == 1) {
                ui.b0(i7).l0((TLRPC.InputStickerSet) this.s.get(0), 0, false, false, new k8(this, 0));
                return;
            } else {
                set(this.s.size());
                d(false);
                return;
            }
        }
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = false;
        this.x = false;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        bg.k0 k0Var = new bg.k0(this, obj, arrayList, zArr, i7, 3);
        if (I != obj || (vector = J) == null) {
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getAttachedStickers, new j8(obj, i7, tL_messages_getAttachedStickers, k0Var, 0));
        } else {
            zArr[0] = false;
            k0Var.run(vector, null);
        }
    }

    public static void a(l8 l8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            I = obj;
            J = vector;
            for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i10);
                l8Var.r.add(stickerSetCovered);
                TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                if (stickerSet != null) {
                    l8Var.s.add(ui.Z(stickerSet));
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    if (stickerSet2.emojis) {
                        l8Var.w = true;
                    } else if (!stickerSet2.masks) {
                        l8Var.x = true;
                    }
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList arrayList2 = l8Var.r;
            int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
            if (l8Var.s != null && arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i11);
                    long j3 = inputStickerSet.id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= l8Var.s.size()) {
                            l8Var.s.add(inputStickerSet);
                            break;
                        } else if (((TLRPC.InputStickerSet) l8Var.s.get(i12)).id == j3) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                l8Var.w = true;
            }
            if (size2 != 1) {
                l8Var.set(size2);
            } else if (l8Var.r.size() >= 1) {
                l8Var.set((TLRPC.StickerSetCovered) l8Var.r.get(0));
            } else {
                if (arrayList != null && arrayList.size() >= 1) {
                    zArr[0] = false;
                    ui.b0(i7).l0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new k8(l8Var, 1));
                    return;
                }
                l8Var.set(0);
            }
            l8Var.d(zArr[0]);
        }
    }

    public static /* synthetic */ void b(l8 l8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        l8Var.set(tL_messages_stickerSet);
        l8Var.d(false);
    }

    public static /* synthetic */ void c(l8 l8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        l8Var.set(tL_messages_stickerSet);
        l8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new yz(org.telegram.ui.ActionBar.l6.Uc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                document = null;
                break;
            } else {
                if (arrayList.get(i7).id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = arrayList.get(i7);
                    break;
                }
                i7++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.r5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z9 = this.w;
        setText(org.telegram.messenger.g0.K2((z9 && this.x) ? id.M0(2131744695, null) : z9 ? id.M0(2131744700, null) : id.M0(2131744692, null), charSequence, "%s"));
    }

    public final void d(boolean z9) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = 1;
        if (!z9) {
            this.D = 1.0f;
            invalidate();
            post(new f8(this, i7));
        } else {
            this.H = ValueAnimator.ofFloat(this.D, 1.0f);
            this.H.addUpdateListener(new ch.u(i7, this, this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > org.telegram.messenger.g0.L(3.0f)));
            this.H.setInterpolator(xq.h);
            this.H.setStartDelay(150L);
            this.H.setDuration(400L);
            this.H.start();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.D;
        if (f10 < 1.0f) {
            b80 b80Var = this.h;
            b80Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float L = org.telegram.messenger.g0.L(12.0f) + getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, L, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.g0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.g0.L(28.0f) + getPaddingTop(), direction);
            b80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            if (this.D > 0.0f) {
                canvas.save();
                canvas.translate(getPaddingLeft() - (id.a0 ? 0.0f : this.e), getPaddingTop());
                this.b.setAlpha((int) (this.D * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.d, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.D, this.c);
                canvas.restore();
            }
        }
    }

    public ru getAlert() {
        if (this.s != null) {
            return new ru(null, getContext(), this.a, this.s);
        }
        int i7 = -this.G;
        this.G = i7;
        org.telegram.messenger.g0.G3(i7, this, null);
        org.telegram.messenger.p2.D.a();
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = View.MeasureSpec.getMode(i7) == 1073741824;
        int paddingTop = getPaddingTop();
        int L = org.telegram.messenger.g0.L(29.0f);
        StaticLayout staticLayout = this.d;
        setMeasuredDimension(z9 ? View.MeasureSpec.getSize(i7) : getMinimumWidth(), getPaddingBottom() + org.telegram.messenger.g0.W1(this.D, L, staticLayout == null ? org.telegram.messenger.g0.L(29.0f) : staticLayout.getHeight()) + paddingTop);
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        if (z9) {
            CharSequence charSequence = this.F;
            if (charSequence == null && (this.d == null || this.E == size)) {
                return;
            }
            if (charSequence == null) {
                charSequence = this.d.getText();
            }
            setText(charSequence);
            this.F = null;
            this.E = size;
        }
    }

    public void setText(CharSequence charSequence) {
        if (getMeasuredWidth() <= 0) {
            this.F = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.F = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? this.d.getLineLeft(0) : 0.0f;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f = org.telegram.ui.Components.r5.update(0, this, this.f, this.d);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            TextPaint textPaint = this.b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, this.a));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h || super.verifyDrawable(drawable);
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        CharSequence charSequence;
        String M0;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new yz(org.telegram.ui.ActionBar.l6.Uc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7).id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i7);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.r5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z9 = this.w;
        if (z9 && this.x) {
            M0 = id.M0(2131744695, null);
        } else if (z9) {
            M0 = id.M0(2131744700, null);
        } else {
            M0 = id.M0(2131744692, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    private void set(int i7) {
        boolean z9 = this.w;
        b80 b80Var = this.h;
        if (z9 && this.x) {
            setText(org.telegram.messenger.g0.S2(id.G(i7, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Uc, b80Var.a), null, null));
        } else if (z9) {
            setText(org.telegram.messenger.g0.S2(id.G(i7, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Uc, b80Var.a), null, null));
        } else {
            setText(org.telegram.messenger.g0.S2(id.G(i7, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Uc, b80Var.a), null, null));
        }
    }
}
