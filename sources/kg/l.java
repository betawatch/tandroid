package kg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseIntArray;
import bi.v6;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends a {
    public final ArrayList d;
    public final Bitmap e;
    public final int f;

    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i10;
        ArrayList arrayList2 = new ArrayList();
        vp r12 = vp.r1(d20.s0);
        if (i10 == 0) {
            arrayList2.add(new j(R.drawable.msg_stories_order, 20, cd.L0(2131746954, null), cd.L0(2131746953, null)));
            arrayList2.add(new j(R.drawable.msg_stories_stealth, 15, cd.L0(2131746948, null), cd.L0(2131746947, null)));
            arrayList2.add(new j(R.drawable.menu_quality_hd, 25, cd.L0(2131746952, null), cd.L0(2131746951, null)));
            arrayList2.add(new j(R.drawable.msg_stories_views, 16, cd.L0(2131746946, null), cd.L0(2131746945, null)));
            arrayList2.add(new j(R.drawable.msg_stories_timer, 17, cd.L0(2131746958, null), cd.L0(2131746957, null)));
            arrayList2.add(new j(R.drawable.msg_stories_save, 18, cd.L0(2131746950, null), cd.L0(2131746949, null)));
            arrayList2.add(new j(R.drawable.msg_stories_caption, 21, cd.L0(2131746960, null), cd.L0(2131746959, null)));
            arrayList2.add(new j(R.drawable.msg_stories_link, 19, cd.L0(2131746956, null), cd.L0(2131746955, null)));
        } else if (i10 == 1) {
            sparseIntArray = r12.O0;
            arrayList2.add(new j(R.drawable.menu_premium_location, 29, cd.L0(2131747068, null), cd.L0(2131747067, null)));
            arrayList2.add(new j(R.drawable.menu_premium_clock, 30, cd.L0(2131747066, null), cd.L0(2131747065, null)));
            arrayList2.add(new j(R.drawable.menu_quickreply, 31, cd.L0(2131747064, null), cd.L0(2131747063, null)));
            arrayList2.add(new j(R.drawable.menu_feature_status, 32, cd.L0(2131747072, null), cd.L0(2131747071, null)));
            arrayList2.add(new j(R.drawable.menu_premium_away, 33, cd.L0(2131747079, null), cd.L0(2131747078, null)));
            arrayList2.add(new j(R.drawable.menu_premium_chatbot, 34, cd.L0(2131747074, null), cd.L0(2131747073, null)));
            arrayList2.add(new j(R.drawable.menu_feature_intro, 36, cd.L0(2131747070, null), cd.L0(2131747069, null)));
            arrayList2.add(new j(R.drawable.menu_premium_chatlink, 37, cd.L0(2131747077, null), cd.L0(2131747076, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new v6(sparseIntArray, 1));
            }
            arrayList.add(new j(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new j(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{t6.x0(null, t6.zk, false), t6.x0(null, t6.Ak, false), t6.x0(null, t6.Bk, false), t6.x0(null, t6.Ck, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        }
        sparseIntArray = null;
        if (sparseIntArray != null) {
        }
        arrayList.add(new j(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new j(2));
        Bitmap createBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.e = createBitmap2;
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{t6.x0(null, t6.zk, false), t6.x0(null, t6.Ak, false), t6.x0(null, t6.Bk, false), t6.x0(null, t6.Ck, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }

    @Override // kg.a
    public final s4.g0 a() {
        return new f(this, 0);
    }
}
