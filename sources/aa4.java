// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aa4 extends lh0 {
    public final ArrayList d;
    public final Bitmap e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa4(int i, ylb ylbVar, Context context) {
        super(context, ylbVar);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i;
        ArrayList arrayList2 = new ArrayList();
        oc7 r1 = oc7.r1(z8c.t0);
        if (i == 0) {
            arrayList2.add(new y94(R.drawable.msg_stories_order, 20, jb6.M0(2131746674, null), jb6.M0(2131746673, null)));
            arrayList2.add(new y94(R.drawable.msg_stories_stealth, 15, jb6.M0(2131746668, null), jb6.M0(2131746667, null)));
            arrayList2.add(new y94(R.drawable.menu_quality_hd, 25, jb6.M0(2131746672, null), jb6.M0(2131746671, null)));
            arrayList2.add(new y94(R.drawable.msg_stories_views, 16, jb6.M0(2131746666, null), jb6.M0(2131746665, null)));
            arrayList2.add(new y94(R.drawable.msg_stories_timer, 17, jb6.M0(2131746678, null), jb6.M0(2131746677, null)));
            arrayList2.add(new y94(R.drawable.msg_stories_save, 18, jb6.M0(2131746670, null), jb6.M0(2131746669, null)));
            arrayList2.add(new y94(R.drawable.msg_stories_caption, 21, jb6.M0(2131746680, null), jb6.M0(2131746679, null)));
            arrayList2.add(new y94(R.drawable.msg_stories_link, 19, jb6.M0(2131746676, null), jb6.M0(2131746675, null)));
        } else if (i == 1) {
            sparseIntArray = r1.F0;
            arrayList2.add(new y94(R.drawable.menu_premium_location, 29, jb6.M0(2131746788, null), jb6.M0(2131746787, null)));
            arrayList2.add(new y94(R.drawable.menu_premium_clock, 30, jb6.M0(2131746786, null), jb6.M0(2131746785, null)));
            arrayList2.add(new y94(R.drawable.menu_quickreply, 31, jb6.M0(2131746784, null), jb6.M0(2131746783, null)));
            arrayList2.add(new y94(R.drawable.menu_feature_status, 32, jb6.M0(2131746792, null), jb6.M0(2131746791, null)));
            arrayList2.add(new y94(R.drawable.menu_premium_away, 33, jb6.M0(2131746799, null), jb6.M0(2131746798, null)));
            arrayList2.add(new y94(R.drawable.menu_premium_chatbot, 34, jb6.M0(2131746794, null), jb6.M0(2131746793, null)));
            arrayList2.add(new y94(R.drawable.menu_feature_intro, 36, jb6.M0(2131746790, null), jb6.M0(2131746789, null)));
            arrayList2.add(new y94(R.drawable.menu_premium_chatlink, 37, jb6.M0(2131746797, null), jb6.M0(2131746796, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new i01(sparseIntArray, (byte) 3));
            }
            arrayList.add(new y94(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new y94(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{cmb.w0(null, cmb.Bk, false), cmb.w0(null, cmb.Ck, false), cmb.w0(null, cmb.Dk, false), cmb.w0(null, cmb.Ek, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        }
        sparseIntArray = null;
        if (sparseIntArray != null) {
        }
        arrayList.add(new y94(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new y94(2));
        Bitmap createBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.e = createBitmap2;
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{cmb.w0(null, cmb.Bk, false), cmb.w0(null, cmb.Ck, false), cmb.w0(null, cmb.Dk, false), cmb.w0(null, cmb.Ek, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }
}
