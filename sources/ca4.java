// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ca4 implements Continuation, e6b {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ ca4(sm2 sm2Var, String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    @Override // e6b
    public final Bitmap n(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b, options);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                return !task.isSuccessful() ? Tasks.forException(sm2.y(task)) : Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }

    public /* synthetic */ ca4(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
