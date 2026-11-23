package fi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class a8 extends View implements org.telegram.ui.ActionBar.c6 {
    public static Object J;
    public static Vector K;
    public float E;
    public int F;
    public CharSequence G;
    public int H;
    public ValueAnimator I;
    public final org.telegram.ui.ActionBar.i6 a;
    public final TextPaint b;
    public final PorterDuffColorFilter c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.t5 f;
    public final n80 h;
    public final Path n;
    public final ArrayList r;
    public final ArrayList s;
    public boolean w;
    public boolean x;
    public final Object y;

    public a8(Context context, int i7, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        Vector vector;
        this.H = -12;
        this.a = i6Var;
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 0, 8);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i11 = org.telegram.ui.ActionBar.n6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        this.c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), PorterDuff.Mode.SRC_IN);
        n80 n80Var = new n80(i6Var);
        this.h = n80Var;
        n80Var.setCallback(this);
        n80Var.f(org.telegram.ui.ActionBar.n6.r1(0.2f, -1), org.telegram.ui.ActionBar.n6.r1(0.05f, -1));
        Path path = new Path();
        this.n = path;
        n80Var.y = path;
        n80Var.k(4.0f);
        boolean[] zArr = {true};
        this.y = obj;
        if (!z10) {
            this.w = true;
            this.x = false;
            ArrayList arrayList2 = new ArrayList();
            this.s = arrayList2;
            arrayList2.addAll(arrayList);
            if (this.s.size() == 1) {
                ri.d0(i7).n0((TLRPC.InputStickerSet) this.s.get(0), 0, false, false, new z7(this, 0));
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
        bg.l0 l0Var = new bg.l0(this, obj, arrayList, zArr, i7, 3);
        if (J != obj || (vector = K) == null) {
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getAttachedStickers, new y7(obj, i7, tL_messages_getAttachedStickers, l0Var, 0));
        } else {
            zArr[0] = false;
            l0Var.run(vector, null);
        }
    }

    public static void a(a8 a8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            J = obj;
            K = vector;
            for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i10);
                a8Var.r.add(stickerSetCovered);
                TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                if (stickerSet != null) {
                    a8Var.s.add(ri.b0(stickerSet));
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    if (stickerSet2.emojis) {
                        a8Var.w = true;
                    } else if (!stickerSet2.masks) {
                        a8Var.x = true;
                    }
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList arrayList2 = a8Var.r;
            int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
            if (a8Var.s != null && arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i11);
                    long j3 = inputStickerSet.id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= a8Var.s.size()) {
                            a8Var.s.add(inputStickerSet);
                            break;
                        } else if (((TLRPC.InputStickerSet) a8Var.s.get(i12)).id == j3) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                a8Var.w = true;
            }
            if (size2 != 1) {
                a8Var.set(size2);
            } else if (a8Var.r.size() >= 1) {
                a8Var.set((TLRPC.StickerSetCovered) a8Var.r.get(0));
            } else {
                if (arrayList != null && arrayList.size() >= 1) {
                    zArr[0] = false;
                    ri.d0(i7).n0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new z7(a8Var, 1));
                    return;
                }
                a8Var.set(0);
            }
            a8Var.d(zArr[0]);
        }
    }

    public static /* synthetic */ void b(a8 a8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        a8Var.set(tL_messages_stickerSet);
        a8Var.d(false);
    }

    public static /* synthetic */ void c(a8 a8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        a8Var.set(tL_messages_stickerSet);
        a8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new i00(org.telegram.ui.ActionBar.n6.Xc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
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
            spannableString.setSpan(new org.telegram.ui.Components.x5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.w;
        setText(org.telegram.messenger.g0.K2((z10 && this.x) ? gd.N0(2131744451, null) : z10 ? gd.N0(2131744456, null) : gd.N0(2131744448, null), charSequence, "%s"));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.E = 1.0f;
            invalidate();
            post(new f2.a(this, 18));
            return;
        }
        int i7 = 1;
        this.I = ValueAnimator.ofFloat(this.E, 1.0f);
        this.I.addUpdateListener(new ch.v(i7, this, this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > org.telegram.messenger.g0.L(3.0f)));
        this.I.setInterpolator(kr.h);
        this.I.setStartDelay(150L);
        this.I.setDuration(400L);
        this.I.start();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.E;
        if (f10 < 1.0f) {
            n80 n80Var = this.h;
            n80Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float L = org.telegram.messenger.g0.L(12.0f) + getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, L, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.g0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.g0.L(28.0f) + getPaddingTop(), direction);
            n80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            if (this.E > 0.0f) {
                canvas.save();
                canvas.translate(getPaddingLeft() - (gd.a0 ? 0.0f : this.e), getPaddingTop());
                this.b.setAlpha((int) (this.E * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.d, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.E, this.c);
                canvas.restore();
            }
        }
    }

    public bv getAlert() {
        if (this.s != null) {
            return new bv(null, getContext(), this.a, this.s);
        }
        int i7 = -this.H;
        this.H = i7;
        org.telegram.messenger.g0.E3(i7, this, null);
        org.telegram.messenger.q2.E.a();
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = View.MeasureSpec.getMode(i7) == 1073741824;
        int paddingTop = getPaddingTop();
        int L = org.telegram.messenger.g0.L(29.0f);
        StaticLayout staticLayout = this.d;
        setMeasuredDimension(z10 ? View.MeasureSpec.getSize(i7) : getMinimumWidth(), getPaddingBottom() + org.telegram.messenger.g0.W1(this.E, L, staticLayout == null ? org.telegram.messenger.g0.L(29.0f) : staticLayout.getHeight()) + paddingTop);
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence charSequence = this.G;
            if (charSequence == null && (this.d == null || this.F == size)) {
                return;
            }
            if (charSequence == null) {
                charSequence = this.d.getText();
            }
            setText(charSequence);
            this.G = null;
            this.F = size;
        }
    }

    public void setText(CharSequence charSequence) {
        if (getMeasuredWidth() <= 0) {
            this.G = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.G = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? this.d.getLineLeft(0) : 0.0f;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f = org.telegram.ui.Components.x5.update(0, this, this.f, this.d);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            TextPaint textPaint = this.b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.a));
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
        String N0;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new i00(org.telegram.ui.ActionBar.n6.Xc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
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
            spannableString.setSpan(new org.telegram.ui.Components.x5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.w;
        if (z10 && this.x) {
            N0 = gd.N0(2131744451, null);
        } else if (z10) {
            N0 = gd.N0(2131744456, null);
        } else {
            N0 = gd.N0(2131744448, null);
        }
        setText(org.telegram.messenger.g0.K2(N0, charSequence, "%s"));
    }

    private void set(int i7) {
        boolean z10 = this.w;
        n80 n80Var = this.h;
        if (z10 && this.x) {
            setText(org.telegram.messenger.g0.R2(gd.G(i7, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, n80Var.a), null, null));
        } else if (z10) {
            setText(org.telegram.messenger.g0.R2(gd.G(i7, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, n80Var.a), null, null));
        } else {
            setText(org.telegram.messenger.g0.R2(gd.G(i7, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, n80Var.a), null, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
