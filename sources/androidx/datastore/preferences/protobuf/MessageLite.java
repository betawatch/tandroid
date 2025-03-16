package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite buildPartial();

        Builder mergeFrom(MessageLite messageLite);
    }

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    void writeTo(CodedOutputStream codedOutputStream);
}
