package ni;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import com.google.android.gms.tasks.OnSuccessListener;
import h9.i0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.k9;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements g9.k, l5.g, k9, OnSuccessListener, r1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    public static d a() {
        InputStream open = t0.b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return new d(new PrismaHighlighter(byteArray));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* bridge */ /* synthetic */ BlendMode d(Object obj) {
        return (BlendMode) obj;
    }

    public static /* bridge */ /* synthetic */ RenderNode e(Object obj) {
        return (RenderNode) obj;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return i0.u(Integer.valueOf(((y2.i) obj).a));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        u1Var.dismiss();
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        switch (this.a) {
            case 10:
                Typeface typeface = g0.a;
                return "%s";
            case 12:
                return "%" + (((Integer) obj).intValue() + 1) + "$s";
            case 28:
                return new TLRPC.TL_messageEntityBold();
            default:
                return new TLRPC.TL_messageEntityItalic();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z9 = r2.a;
        a8.b("sms listener registered");
    }

    @Override // l5.g
    public void b(Exception exc) {
    }
}
