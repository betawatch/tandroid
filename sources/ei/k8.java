package ei;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k8 extends View implements org.telegram.ui.ActionBar.z5 {
    public static Object J;
    public static Vector K;
    public float E;
    public int F;
    public CharSequence G;
    public int H;
    public ValueAnimator I;
    public final org.telegram.ui.ActionBar.e6 a;
    public final TextPaint b;
    public final PorterDuffColorFilter c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.l5 f;
    public final w70 h;
    public final Path n;
    public final ArrayList r;
    public final ArrayList s;
    public boolean w;
    public boolean x;
    public final Object y;

    public k8(Context context, int i3, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Vector vector;
        this.H = -12;
        this.a = e6Var;
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 0, 8);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i11 = org.telegram.ui.ActionBar.k6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        this.c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        w70 w70Var = new w70(e6Var);
        this.h = w70Var;
        w70Var.setCallback(this);
        w70Var.f(org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.05f, -1));
        Path path = new Path();
        this.n = path;
        w70Var.y = path;
        w70Var.k(4.0f);
        boolean[] zArr = {true};
        this.y = obj;
        if (!z10) {
            this.w = true;
            this.x = false;
            ArrayList arrayList2 = new ArrayList();
            this.s = arrayList2;
            arrayList2.addAll(arrayList);
            if (this.s.size() == 1) {
                li.b0(i3).l0((TLRPC.InputStickerSet) this.s.get(0), 0, false, false, new j8(this, 0));
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
        cg.j0 j0Var = new cg.j0(this, obj, arrayList, zArr, i3, 3);
        if (J != obj || (vector = K) == null) {
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getAttachedStickers, new i8(obj, i3, tL_messages_getAttachedStickers, j0Var, 0));
        } else {
            zArr[0] = false;
            j0Var.run(vector, null);
        }
    }

    public static void a(k8 k8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i3) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            J = obj;
            K = vector;
            for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i10);
                k8Var.r.add(stickerSetCovered);
                TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                if (stickerSet != null) {
                    k8Var.s.add(li.Z(stickerSet));
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    if (stickerSet2.emojis) {
                        k8Var.w = true;
                    } else if (!stickerSet2.masks) {
                        k8Var.x = true;
                    }
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList arrayList2 = k8Var.r;
            int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
            if (k8Var.s != null && arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i11);
                    long j10 = inputStickerSet.id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= k8Var.s.size()) {
                            k8Var.s.add(inputStickerSet);
                            break;
                        } else if (((TLRPC.InputStickerSet) k8Var.s.get(i12)).id == j10) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                k8Var.w = true;
            }
            if (size2 != 1) {
                k8Var.set(size2);
            } else if (k8Var.r.size() >= 1) {
                k8Var.set((TLRPC.StickerSetCovered) k8Var.r.get(0));
            } else {
                if (arrayList != null && arrayList.size() >= 1) {
                    zArr[0] = false;
                    li.b0(i3).l0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new j8(k8Var, 1));
                    return;
                }
                k8Var.set(0);
            }
            k8Var.d(zArr[0]);
        }
    }

    public static /* synthetic */ void b(k8 k8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        k8Var.set(tL_messages_stickerSet);
        k8Var.d(false);
    }

    public static /* synthetic */ void c(k8 k8Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        k8Var.set(tL_messages_stickerSet);
        k8Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new tz(org.telegram.ui.ActionBar.k6.Uc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                document = null;
                break;
            } else {
                if (arrayList.get(i3).id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = arrayList.get(i3);
                    break;
                }
                i3++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.p5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.w;
        setText(org.telegram.messenger.g0.K2((z10 && this.x) ? bd.M0(2131744705, null) : z10 ? bd.M0(2131744710, null) : bd.M0(2131744702, null), charSequence, "%s"));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.E = 1.0f;
            invalidate();
            post(new z5(this, 7));
            return;
        }
        int i3 = 1;
        this.I = ValueAnimator.ofFloat(this.E, 1.0f);
        this.I.addUpdateListener(new dh.u(i3, this, this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > org.telegram.messenger.g0.L(3.0f)));
        this.I.setInterpolator(xq.h);
        this.I.setStartDelay(150L);
        this.I.setDuration(400L);
        this.I.start();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f10 = this.E;
        if (f10 < 1.0f) {
            w70 w70Var = this.h;
            w70Var.setAlpha((int) ((1.0f - f10) * 255.0f));
            Path path = this.n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float L = org.telegram.messenger.g0.L(12.0f) + getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, L, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.g0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.g0.L(28.0f) + getPaddingTop(), direction);
            w70Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            if (this.E > 0.0f) {
                canvas.save();
                canvas.translate(getPaddingLeft() - (bd.a0 ? 0.0f : this.e), getPaddingTop());
                this.b.setAlpha((int) (this.E * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.d, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.E, this.c);
                canvas.restore();
            }
        }
    }

    public pu getAlert() {
        if (this.s != null) {
            return new pu(null, getContext(), this.a, this.s);
        }
        int i3 = -this.H;
        this.H = i3;
        org.telegram.messenger.g0.G3(i3, this, null);
        org.telegram.messenger.p2.E.a();
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = View.MeasureSpec.getMode(i3) == 1073741824;
        int paddingTop = getPaddingTop();
        int L = org.telegram.messenger.g0.L(29.0f);
        StaticLayout staticLayout = this.d;
        setMeasuredDimension(z10 ? View.MeasureSpec.getSize(i3) : getMinimumWidth(), getPaddingBottom() + org.telegram.messenger.g0.W1(this.E, L, staticLayout == null ? org.telegram.messenger.g0.L(29.0f) : staticLayout.getHeight()) + paddingTop);
        int size = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
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
        this.f = org.telegram.ui.Components.p5.update(0, this, this.f, this.d);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            TextPaint textPaint = this.b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.a));
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
        spannableString.setSpan(new tz(org.telegram.ui.ActionBar.k6.Uc, this.h.a), 0, spannableString.length(), 33);
        spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3).id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i3);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.p5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.w;
        if (z10 && this.x) {
            M0 = bd.M0(2131744705, null);
        } else if (z10) {
            M0 = bd.M0(2131744710, null);
        } else {
            M0 = bd.M0(2131744702, null);
        }
        setText(org.telegram.messenger.g0.K2(M0, charSequence, "%s"));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    private void set(int i3) {
        boolean z10 = this.w;
        w70 w70Var = this.h;
        if (z10 && this.x) {
            setText(org.telegram.messenger.g0.S2(bd.G(i3, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, w70Var.a), null, null));
        } else if (z10) {
            setText(org.telegram.messenger.g0.S2(bd.G(i3, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, w70Var.a), null, null));
        } else {
            setText(org.telegram.messenger.g0.S2(bd.G(i3, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, w70Var.a), null, null));
        }
    }
}
