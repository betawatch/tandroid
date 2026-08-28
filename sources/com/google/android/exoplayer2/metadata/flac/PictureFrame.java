package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import c.c;
import d5.f0;
import d5.y;
import h3.g1;
import h3.t0;
import j3.r0;
import java.util.Arrays;
import n8.d;
import z3.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class PictureFrame implements b {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new c(1);
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public PictureFrame(int i9, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.pictureType = i9;
        this.mimeType = str;
        this.description = str2;
        this.width = i10;
        this.height = i11;
        this.depth = i12;
        this.colors = i13;
        this.pictureData = bArr;
    }

    public static PictureFrame fromPictureBlock(y yVar) {
        int e10 = yVar.e();
        String p6 = yVar.p(yVar.e(), d.a);
        String p9 = yVar.p(yVar.e(), d.c);
        int e11 = yVar.e();
        int e12 = yVar.e();
        int e13 = yVar.e();
        int e14 = yVar.e();
        int e15 = yVar.e();
        byte[] bArr = new byte[e15];
        yVar.c(0, e15, bArr);
        return new PictureFrame(e10, p6, p9, e11, e12, e13, e14, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    @Override // z3.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // z3.b
    public /* bridge */ /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictureData) + ((((((((r0.f(r0.f((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override // z3.b
    public void populateMediaMetadata(g1 g1Var) {
        g1Var.a(this.pictureType, this.pictureData);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }

    public PictureFrame(Parcel parcel) {
        this.pictureType = parcel.readInt();
        String readString = parcel.readString();
        int i9 = f0.a;
        this.mimeType = readString;
        this.description = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
