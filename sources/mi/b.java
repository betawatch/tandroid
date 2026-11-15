package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.s;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class b extends FrameLayout implements z5 {
    public final e6 a;
    public final i9 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        i9 i9Var = new i9(context);
        this.b = i9Var;
        i9Var.setRoundRadius(g0.L(7.3125f));
        addView(i9Var, ja.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ja.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ja.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, ja.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, ja.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i7, TLRPC.Chat chat) {
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull N0 = np.s1(i7).N0(chat.id);
        setTitle(m5.u(chat));
        setSubtitle(hd.G(N0 != null ? N0.linked_peers.size() : 0, "CommunityWithChats", new Object[0]));
        this.b.f(chat, new t8(chat));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.z6));
        hashSet.add(Integer.valueOf(j6.G6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = j6.S0;
        i9 i9Var = this.b;
        s.a(canvas, drawable, (i9Var.getWidth() / 2.0f) + i9Var.getLeft(), (i9Var.getHeight() / 2.0f) + i9Var.getTop(), i9Var.getHeight());
        super.dispatchDraw(canvas);
        e6 e6Var = this.a;
        Paint d = e6Var != null ? e6Var.d("paintDivider") : null;
        if (d == null) {
            d = j6.k0;
        }
        canvas.drawLine(g0.L(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(56.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = j6.z6;
        e6 e6Var = this.a;
        this.e.setColorFilter(j6.w0(i7, e6Var));
        this.c.setTextColor(j6.w0(j6.G6, e6Var));
        this.d.setTextColor(j6.w0(i7, e6Var));
    }
}
