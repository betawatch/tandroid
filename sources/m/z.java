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
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import g7.p6;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        ((org.telegram.ui.Cells.e3) ((m5.c0) this.c).b).getClass();
        if (keyListener instanceof q1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new q1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i9) {
        switch (this.a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                j4.c E = j4.c.E(absSeekBar.getContext(), attributeSet, d, i9);
                Drawable x10 = E.x(0);
                if (x10 != null) {
                    if (x10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) x10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(10000);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        x10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(x10);
                }
                Drawable x11 = E.x(1);
                if (x11 != null) {
                    absSeekBar.setProgressDrawable(e(x11, false));
                }
                E.G();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, f.a.i, i9, 0);
                try {
                    boolean z10 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public q1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        m5.c0 c0Var = (m5.c0) this.c;
        if (inputConnection == null) {
            c0Var.getClass();
            inputConnection = null;
        } else {
            org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) c0Var.b;
            e3Var.getClass();
            if (!(inputConnection instanceof q1.b)) {
                inputConnection = new q1.b((EditText) e3Var.b, inputConnection, editorInfo);
            }
        }
        return (q1.b) inputConnection;
    }

    public void d(boolean z10) {
        q1.i iVar = (q1.i) ((org.telegram.ui.Cells.e3) ((m5.c0) this.c).b).c;
        if (iVar.c != z10) {
            if (iVar.b != null) {
                androidx.emoji2.text.k a2 = androidx.emoji2.text.k.a();
                q1.h hVar = iVar.b;
                a2.getClass();
                p6.a(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.c = z10;
            if (z10) {
                q1.i.a(iVar.a, androidx.emoji2.text.k.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
        if (drawable instanceof j0.c) {
            j0.d dVar = (j0.d) ((j0.c) drawable);
            Drawable drawable2 = dVar.f;
            if (drawable2 != null) {
                dVar.h(e(drawable2, z10));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    int id2 = layerDrawable.getId(i9);
                    drawableArr[i9] = e(layerDrawable.getDrawable(i9), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    if (Build.VERSION.SDK_INT >= 23) {
                        e0.b.A(layerDrawable, layerDrawable2, i10);
                    }
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

    public z(AbsSeekBar absSeekBar) {
        this.b = absSeekBar;
    }

    public z(EditText editText) {
        this.b = editText;
        this.c = new m5.c0(editText);
    }
}
