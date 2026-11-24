// default package

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.ProfilingResult;
import android.util.Log;
import android.view.View;
import j$.util.function.Consumer$-CC;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ay2 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ay2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        int i;
        nv8 nv8Var;
        float f;
        float f2;
        float[] fArr;
        byte b = this.a;
        int i2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((dy2) obj3).g((String) obj2, (ProfilingResult) obj);
                break;
            case 1:
                FilesMigrationService filesMigrationService = (FilesMigrationService) obj3;
                Path path = (Path) obj;
                boolean z = FilesMigrationService.c;
                File file = new File((File) obj2, path.getFileName().toString());
                if (!Files.isDirectory(path, new LinkOption[0])) {
                    try {
                        Files.move(path, file.toPath(), new CopyOption[0]);
                    } catch (Exception e) {
                        fa4.g(e, false);
                        try {
                            path.toFile().delete();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                    }
                    filesMigrationService.b++;
                    if (System.currentTimeMillis() > 20 || filesMigrationService.b >= filesMigrationService.a - 1) {
                        gl.c3(new sm3((Object) filesMigrationService, filesMigrationService.b, (byte) 6));
                        break;
                    }
                } else {
                    filesMigrationService.c(path.toFile(), file);
                    break;
                }
                break;
            case 2:
                gw8 gw8Var = (gw8) obj3;
                nv8 nv8Var2 = (nv8) obj2;
                Canvas canvas = (Canvas) obj;
                sx3 sx3Var = gw8Var.y;
                RectF rectF = sx3Var.N;
                WeakHashMap weakHashMap = sx3Var.O;
                Paint paint = sx3Var.c;
                long currentTimeMillis = System.currentTimeMillis() - sx3.g0;
                while (i2 < nv8Var2.getChildCount()) {
                    View childAt = nv8Var2.getChildAt(i2);
                    if ((childAt instanceof mv8) && childAt.getVisibility() == 0) {
                        if (weakHashMap.containsKey(childAt)) {
                            f = 10.0f;
                            f2 = 2.5f;
                        } else {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(gl.L(10.0f));
                            f2 = 2.5f;
                            f = 10.0f;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) gl.N(2.5f))));
                        }
                        String key = ((mv8) childAt).getKey();
                        if (key != null && (fArr = (float[]) sx3Var.n.get(key)) != null) {
                            float b2 = sx3.b(fArr, currentTimeMillis);
                            if (b2 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float width = childAt.getWidth();
                                float height = childAt.getHeight();
                                i = i2;
                                float N = (int) gl.N(f2);
                                nv8Var = nv8Var2;
                                rectF.set(translationX + N, translationY + N, (translationX + width) - N, (translationY + height) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (46.0f * b2));
                                    canvas.drawRoundRect(rectF, gl.L(f), gl.L(f), paint);
                                }
                                i2 = i + 1;
                                nv8Var2 = nv8Var;
                            }
                        }
                    }
                    i = i2;
                    nv8Var = nv8Var2;
                    i2 = i + 1;
                    nv8Var2 = nv8Var;
                }
                if (!gw8Var.d.J.isEmpty()) {
                    gw8Var.y.invalidate();
                    break;
                }
                break;
            default:
                String str = (String) obj2;
                nz2 nz2Var = ((n6a) obj3).b;
                i80 i80Var = new i80(new j80(((Integer) obj).intValue()));
                try {
                    nz2.g.getClass();
                    nz2.g(nz2Var.b.b(str, "profiling-manager-info"), lz2.a.q(i80Var));
                    break;
                } catch (IOException e3) {
                    Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e3);
                }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        byte b = this.a;
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
