package lh;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b2 {
    public NinePatchDrawable b;
    public NinePatchDrawable d;
    public NinePatchDrawable f;
    public final float[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final Bitmap[] a = new Bitmap[1];
    public final Bitmap[] c = new Bitmap[1];
    public final Bitmap[] e = new Bitmap[1];

    public b2() {
        float[] fArr = new float[8];
        this.g = fArr;
        Arrays.fill(fArr, AndroidUtilities.dp(11.0f));
    }
}
