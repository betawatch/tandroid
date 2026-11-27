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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m94 extends lg0 {
    public final ArrayList d;
    public final Bitmap e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m94(int i, vnb vnbVar, Context context) {
        super(context, vnbVar);
        SparseIntArray sparseIntArray;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = i;
        ArrayList arrayList2 = new ArrayList();
        uc7 s1 = uc7.s1(yac.t0);
        if (i == 0) {
            arrayList2.add(new k94(R.drawable.msg_stories_order, 20, ob6.M0(2131746668, null), ob6.M0(2131746667, null)));
            arrayList2.add(new k94(R.drawable.msg_stories_stealth, 15, ob6.M0(2131746662, null), ob6.M0(2131746661, null)));
            arrayList2.add(new k94(R.drawable.menu_quality_hd, 25, ob6.M0(2131746666, null), ob6.M0(2131746665, null)));
            arrayList2.add(new k94(R.drawable.msg_stories_views, 16, ob6.M0(2131746660, null), ob6.M0(2131746659, null)));
            arrayList2.add(new k94(R.drawable.msg_stories_timer, 17, ob6.M0(2131746672, null), ob6.M0(2131746671, null)));
            arrayList2.add(new k94(R.drawable.msg_stories_save, 18, ob6.M0(2131746664, null), ob6.M0(2131746663, null)));
            arrayList2.add(new k94(R.drawable.msg_stories_caption, 21, ob6.M0(2131746674, null), ob6.M0(2131746673, null)));
            arrayList2.add(new k94(R.drawable.msg_stories_link, 19, ob6.M0(2131746670, null), ob6.M0(2131746669, null)));
        } else if (i == 1) {
            sparseIntArray = s1.F0;
            arrayList2.add(new k94(R.drawable.menu_premium_location, 29, ob6.M0(2131746782, null), ob6.M0(2131746781, null)));
            arrayList2.add(new k94(R.drawable.menu_premium_clock, 30, ob6.M0(2131746780, null), ob6.M0(2131746779, null)));
            arrayList2.add(new k94(R.drawable.menu_quickreply, 31, ob6.M0(2131746778, null), ob6.M0(2131746777, null)));
            arrayList2.add(new k94(R.drawable.menu_feature_status, 32, ob6.M0(2131746786, null), ob6.M0(2131746785, null)));
            arrayList2.add(new k94(R.drawable.menu_premium_away, 33, ob6.M0(2131746793, null), ob6.M0(2131746792, null)));
            arrayList2.add(new k94(R.drawable.menu_premium_chatbot, 34, ob6.M0(2131746788, null), ob6.M0(2131746787, null)));
            arrayList2.add(new k94(R.drawable.menu_feature_intro, 36, ob6.M0(2131746784, null), ob6.M0(2131746783, null)));
            arrayList2.add(new k94(R.drawable.menu_premium_chatlink, 37, ob6.M0(2131746791, null), ob6.M0(2131746790, null)));
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new jz0(sparseIntArray, (byte) 3));
            }
            arrayList.add(new k94(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new k94(2));
            Bitmap createBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.e = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, createBitmap.getWidth(), 0.0f, new int[]{aob.w0(null, aob.Ck, false), aob.w0(null, aob.Dk, false), aob.w0(null, aob.Ek, false), aob.w0(null, aob.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), paint);
        }
        sparseIntArray = null;
        if (sparseIntArray != null) {
        }
        arrayList.add(new k94(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new k94(2));
        Bitmap createBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.e = createBitmap2;
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, createBitmap2.getWidth(), 0.0f, new int[]{aob.w0(null, aob.Ck, false), aob.w0(null, aob.Dk, false), aob.w0(null, aob.Ek, false), aob.w0(null, aob.Fk, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight(), paint2);
    }
}
