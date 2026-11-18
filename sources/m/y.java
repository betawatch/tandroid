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
import c8.tb;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.telegram.ui.Cells.b5;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class y {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int a = 2;
    public View b;
    public Object c;

    public /* synthetic */ y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((ji.j) ((b5) this.c).a).getClass();
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
                h6.m D = h6.m.D(absSeekBar.getContext(), attributeSet, d, i7);
                Drawable v = D.v(0);
                if (v != null) {
                    if (v instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) v;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        v = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(v);
                }
                Drawable v10 = D.v(1);
                if (v10 != null) {
                    absSeekBar.setProgressDrawable(e(v10, false));
                }
                D.G();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i7, 0);
                try {
                    boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public t1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        b5 b5Var = (b5) this.c;
        if (inputConnection == null) {
            b5Var.getClass();
            inputConnection = null;
        } else {
            ji.j jVar = (ji.j) b5Var.a;
            jVar.getClass();
            if (!(inputConnection instanceof t1.b)) {
                inputConnection = new t1.b((EditText) jVar.b, inputConnection, editorInfo);
            }
        }
        return (t1.b) inputConnection;
    }

    public void d(boolean z10) {
        t1.i iVar = (t1.i) ((ji.j) ((b5) this.c).a).c;
        if (iVar.c != z10) {
            if (iVar.b != null) {
                androidx.emoji2.text.l a10 = androidx.emoji2.text.l.a();
                t1.h hVar = iVar.b;
                a10.getClass();
                tb.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.c = z10;
            if (z10) {
                t1.i.a(iVar.a, androidx.emoji2.text.l.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
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
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public y(AbsSeekBar absSeekBar) {
        this.b = absSeekBar;
    }

    public y(EditText editText) {
        this.b = editText;
        this.c = new b5(editText);
    }
}
