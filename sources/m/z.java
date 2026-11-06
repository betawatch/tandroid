package m;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import c8.ob;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class z {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int a = 2;
    public View b;
    public Object c;

    public /* synthetic */ z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((m4.d0) ((org.telegram.ui.Components.n) this.c).a).getClass();
        if (keyListener instanceof t1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new t1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i7) {
        switch (this.a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                h6.m x10 = h6.m.x(absSeekBar.getContext(), attributeSet, d, i7);
                Drawable q10 = x10.q(0);
                if (q10 != null) {
                    if (q10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) q10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        q10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(q10);
                }
                Drawable q11 = x10.q(1);
                if (q11 != null) {
                    absSeekBar.setProgressDrawable(e(q11, false));
                }
                x10.C();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i7, 0);
                try {
                    boolean z9 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z9);
                    return;
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public t1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.c;
        if (inputConnection == null) {
            nVar.getClass();
            inputConnection = null;
        } else {
            m4.d0 d0Var = (m4.d0) nVar.a;
            d0Var.getClass();
            if (!(inputConnection instanceof t1.b)) {
                inputConnection = new t1.b((EditText) d0Var.a, inputConnection, editorInfo);
            }
        }
        return (t1.b) inputConnection;
    }

    public void d(boolean z9) {
        t1.i iVar = (t1.i) ((m4.d0) ((org.telegram.ui.Components.n) this.c).a).b;
        if (iVar.c != z9) {
            if (iVar.b != null) {
                androidx.emoji2.text.l a10 = androidx.emoji2.text.l.a();
                t1.h hVar = iVar.b;
                a10.getClass();
                ob.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.c = z9;
            if (z9) {
                t1.i.a(iVar.a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z9) {
        if (drawable instanceof j0.b) {
            ((j0.c) ((j0.b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id2 = layerDrawable.getId(i7);
                    drawableArr[i7] = e(layerDrawable.getDrawable(i7), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z9 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public z(AbsSeekBar absSeekBar) {
        this.b = absSeekBar;
    }

    public z(EditText editText) {
        this.b = editText;
        this.c = new org.telegram.ui.Components.n(editText);
    }
}
